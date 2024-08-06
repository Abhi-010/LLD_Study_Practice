package innerclass;

public class OuterClass {
    //static variable
    public static String msg = "Scaler";

    public static class NestedStaticClass{
        //static nested class
        //Only static members of the outer class is
        //directly accessible in this inner static class

        public void printMessage(){
            System.out.println("Message from nested static class " + msg);
        }
    }
    //Non-Static Nested Class
    //Also called Inner Class


    public class InnerClass{
        //Both static and non-static members of outer classs
        //are accessible in this Inner Class
        public void display(){
            System.out.println("Message from non-static nested class " + msg);
        }
    }
}
