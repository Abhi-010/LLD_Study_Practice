package threads.creation.AdderSubstractor.SynchronizedObject;

import java.util.concurrent.locks.Lock;

public class Subtractor implements Runnable{

    private Count count;

    public Subtractor(Count count)
    {
        this.count = count;
    }

    @Override
    public void run() {

        for(int i = 1 ; i <= 100000 ; i++){
            synchronized (count){
                System.out.println("Sub has lock");
                int currentValue = count.getCount();
                currentValue = currentValue - 1;
                count.setCount(currentValue);
                System.out.println("sub unlock");
            }
        }
    }
}
