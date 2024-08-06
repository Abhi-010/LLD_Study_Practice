package Interface;

public class client {
    public static void main(String[] args) {

        class1 outerObj = new class1() ;

        Edible obj1 = outerObj.e ;
        System.out.println(obj1.func1());

        Edible obj2 = outerObj.e ;

        if(obj1 == obj2){
            System.out.println("obj1 is equal to obj2");
        }
    }

}
