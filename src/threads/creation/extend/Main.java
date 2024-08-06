package threads.creation.extend;

public class Main {
    public static void main(String[] args) {
        System.out.println("Main method thread name = " +
                Thread.currentThread().getName());
        PrintHelloWorld printHelloWorld = new PrintHelloWorld();
        //printHelloWorld.start();
        Thread t = new Thread(printHelloWorld);
        t.start();
    }
}
