package AbstractClass;

public abstract class Circle extends GeometricObject{
    private int radius ;
    Circle(){

    }
    Circle(int radius){
        this.radius = radius ;
    }
    @Override
    public double getArea() {
        return 3.14 * radius * radius ;
    }

    @Override
    public double getPerimeter() {
        return 2 * 3.14 * radius;
    }

}
