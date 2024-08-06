package threads.creation.method2;

public class PrintNumber implements Runnable{
    private int number;
    PrintNumber(int number){
        this.number = number;
    }
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + " " +
                "number " + this.number);
    }
}
