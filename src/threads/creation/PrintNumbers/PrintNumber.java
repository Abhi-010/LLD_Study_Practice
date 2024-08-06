package threads.creation.PrintNumbers;

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
