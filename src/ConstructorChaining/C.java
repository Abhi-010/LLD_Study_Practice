package ConstructorChaining;

public class C extends B{
    C(){
        this("abc");
        System.out.println("Constructor of C");
    }
    C(String param){
        System.out.println("Constructor of C with param");
    }
}
