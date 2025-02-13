package threads.creation.ProducerConsumerMutex;

import java.util.ArrayDeque;
import java.util.Queue;

public class Consumer implements Runnable {
    private Queue<Shirt> store = new ArrayDeque<>();
    private String name ;

    public Consumer(Queue<Shirt> store, String name){
        this.store = store;
        this.name = name;
    }
    @Override
    public void run() {
        while(true){
            if(store.size() > 0){
                store.remove();
                System.out.println(name + " consumed. Left Shirts count = " + store.size());
            }
        }
    }
}
