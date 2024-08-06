package threads.creation.method2;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
       // Executor executor = Executors.newCachedThreadPool();
        List<Thread> list = new ArrayList<>();
        for(int i = 0 ; i<100 ; i++){
            if(i==50){
                System.out.println("Wait");
            }
            PrintNumber printNumber = new PrintNumber(i);
            Thread t = new Thread(printNumber);
            t.start();

            list.add(t);

//            PrintNumber printNumber = new PrintNumber(i);
//            executor.execute(printNumber);
        }
    }
}
