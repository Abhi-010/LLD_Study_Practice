package Polymorphism1;

import java.util.Random;

public class Client {
    public static A getSomething(){
        Random r = new Random();
        int i = r.nextInt();
        if(i%2 == 0){
            return new B();
        }
        else{
            return new C();
        }
    }
    public static void main(String[] args) {
            A a = new C();
            a = getSomething();
        ((C)a).companyName = "ABC";
    }
}
