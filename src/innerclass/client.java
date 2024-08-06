package innerclass;

public class client {
    public static void main(String[] args){
       //Creating instance of nested static class
        OuterClass.NestedStaticClass printer = new OuterClass.NestedStaticClass();
        printer.printMessage();

        //Note : In order to create an instanc of Inner Clas(non - static class)
        //we need to first create an instance of outer class

        OuterClass outer = new OuterClass();
        OuterClass.InnerClass inner = outer.new InnerClass();
        inner.display();


        OuterClass.InnerClass innerClass = outer.new InnerClass();

        OuterClass.NestedStaticClass obj = new OuterClass.NestedStaticClass();



    }
}
