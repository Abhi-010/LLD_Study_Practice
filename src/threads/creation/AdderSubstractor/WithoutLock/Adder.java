package threads.creation.AdderSubstractor.WithoutLock;

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
            synchronized (count){
                System.out.println("Adder has lock");
                int currentValue = count.getCount();
                currentValue = currentValue+1;
                count.setCount(currentValue);
                System.out.println("Adder unlocked");
            }
            try{
                Thread.sleep(10);
            }
            catch (Exception e){
                System.out.println("Error");
            }




        }
        //lockForCount.unlock();
        //System.out.println("Adder unlocked");
    }
}
