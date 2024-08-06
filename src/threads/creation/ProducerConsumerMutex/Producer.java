package threads.creation.ProducerConsumerMutex;

import java.util.ArrayDeque;
import java.util.Queue;

public class Producer implements Runnable{
    Queue<Shirt> store = new ArrayDeque<>();
    private int maxSizeOfStore ;
    private String name;
    public Producer(Queue<Shirt> queue, int maxSizeOfStore, String name){
        this.store = queue;
        this.maxSizeOfStore = maxSizeOfStore;
        this.name  = name;
    }

    @Override
    public void run() {
        while(true){
            if(store.size() < this.maxSizeOfStore){
                store.add(new Shirt());
                System.out.println(name + " produced. Left Shirts count = " + store.size());
            }
        }
    }

}
