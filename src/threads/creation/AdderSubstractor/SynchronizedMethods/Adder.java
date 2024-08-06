package threads.creation.AdderSubstractor.SynchronizedMethods;

import java.util.concurrent.locks.Lock;

public class Adder implements Runnable{
    private Count count;

    public Adder(Count count)
    {
        this.count = count;
    }
    @Override
    public void run() {
        //lockForCount.lock();
        //System.out.println("Adder has lock");
        for(int i = 1 ; i <= 100000 ; i++){
            count.incrementValue(i);
        }
        //lockForCount.unlock();
        //System.out.println("Adder unlocked");
    }
}
