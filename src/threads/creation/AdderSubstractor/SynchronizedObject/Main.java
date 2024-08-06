package threads.creation.AdderSubstractor.SynchronizedObject;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Main {
    public static void main(String[] args) {
        Count count = new Count();

        Adder adder = new Adder(count);
        Subtractor subtractor = new Subtractor(count);
        ExecutorService executorService = Executors.newCachedThreadPool();
        executorService.execute(adder);
        executorService.execute(subtractor);
        executorService.shutdown();
        try{
            executorService.awaitTermination(10, TimeUnit.SECONDS);
        }
        catch (Exception e){
            System.out.println("Something happened incorrect");
        }
        System.out.println(count.getCount());
    }
}
