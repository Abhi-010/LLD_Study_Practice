package threads.creation.AdderSubstractor.WithLock;

import java.util.concurrent.locks.Lock;

public class Adder implements Runnable{
    private Count count;
    private Lock lockForCount;
    public Adder(Count count, Lock lockForCount)
    {
        this.count = count;
        this.lockForCount = lockForCount;
    }
    @Override
    public void run() {
        //lockForCount.lock();
        //System.out.println("Adder has lock");
        for(int i = 1 ; i <= 100000 ; i++){
            lockForCount.lock();
            System.out.println("Adder has lock");
            int currentValue = count.getCount();
            currentValue = currentValue+1;
            count.setCount(currentValue);
            lockForCount.unlock();
            System.out.println("Adder unlocked");
        }
        //lockForCount.unlock();
        //System.out.println("Adder unlocked");
    }
}
