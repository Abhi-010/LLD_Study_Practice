package threads.creation.AdderSubstractor.WithLock;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Main {
    public static void main(String[] args) {
        Count count = new Count();

        Lock lockForCount = new ReentrantLock();

        Adder adder = new Adder(count,lockForCount);
        Subtractor subtractor = new Subtractor(count,lockForCount);
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
