package threads.creation.PrintNumbers;

public class Main {
    public static void main(String[] args) {
        for(int i = 0 ; i<100 ; i++){
            PrintNumber printNumber = new PrintNumber(i);

            Thread t = new Thread(printNumber);
            t.start();
        }
    }
}
