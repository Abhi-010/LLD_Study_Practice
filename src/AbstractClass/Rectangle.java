package AbstractClass;

public class Rectangle extends GeometricObject{
    private int length ;
    private int breadth ;

    Rectangle(){

    }
    Rectangle(int length,int radius){
        this.length = length;
        this.breadth = breadth;
    }
    @Override
    public double getArea() {
        return length * breadth;
    }

    @Override
    public double getPerimeter() {
        return length + breadth;
    }
}
