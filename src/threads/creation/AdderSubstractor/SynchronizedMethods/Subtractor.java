package threads.creation.AdderSubstractor.SynchronizedMethods;

import java.util.concurrent.locks.Lock;

public class Subtractor implements Runnable{

    private Count count;
    public Subtractor(Count count)
    {
        this.count = count;

    }

    @Override
    public void run() {
//        lockForCount.lock();
//        System.out.println("Sub has lock");
        for(int i = 1 ; i <= 100000 ; i++){
           count.incrementValue(-i);
        }
//        lockForCount.unlock();
//        System.out.println("Sub unlocked");
    }
}
