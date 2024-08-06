package threads.creation.ProducerConsumerSemaphore;

import java.util.ArrayDeque;
import java.util.Queue;
import java.util.concurrent.Semaphore;

public class Consumer implements Runnable {
    private Queue<Shirt> store = new ArrayDeque<>();
    private String name ;

    private Semaphore semaForProducer;
    private Semaphore semaForConsumer;

    public Consumer(Queue<Shirt> store, String name,Semaphore semaForProducer,Semaphore semaForConsumer){
        this.store = store;
        this.name = name;
        this.semaForConsumer = semaForConsumer;
        this.semaForProducer = semaForProducer;
    }
    @Override
    public void run() {
        while (true){
            try {
                semaForConsumer.acquire();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            if(store.size() > 0){
                store.remove();
                System.out.println(name + " consumed. Left Shirts count = " + store.size());
            }
            semaForProducer.release();
        }

    }
}
