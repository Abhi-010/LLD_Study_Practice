package overloading;

public class A {

    int doSomething(){
        System.out.println("Doing something without param");
        return 0;
    }
    String doSomething(String hello){
        System.out.println("Doing something with return string");
        return "";
    }
}
