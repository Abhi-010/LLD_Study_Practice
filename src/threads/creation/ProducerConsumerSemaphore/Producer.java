package threads.creation.ProducerConsumerSemaphore;

import java.util.ArrayDeque;
import java.util.Queue;
import java.util.concurrent.Semaphore;

public class Producer implements Runnable{
    Queue<Shirt> store = new ArrayDeque<>();
    private int maxSizeOfStore ;
    private String name;

    private Semaphore semaForProducer;
    private Semaphore semaForConsumer;
    public Producer(Queue<Shirt> queue, int maxSizeOfStore, String name
    ,Semaphore semaForProducer,Semaphore semaForConsumer){
        this.store = queue;
        this.maxSizeOfStore = maxSizeOfStore;
        this.name  = name;
        this.semaForProducer = semaForProducer;
        this.semaForConsumer = semaForConsumer;
    }

    @Override
    public void run() {
        while(true){
            try {
                semaForProducer.acquire();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            if(store.size() < this.maxSizeOfStore){
                store.add(new Shirt());
                System.out.println(name + " produced. Left Shirts count = " + store.size());
            }
            semaForConsumer.release();
        }
    }

}
