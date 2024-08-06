package Overriding;

public class Manager {
    public static void main(String[] args) {
//       B b = new C();
//        b.doSomething();

        C c = new D();
        c.doSomething();
    }

}
