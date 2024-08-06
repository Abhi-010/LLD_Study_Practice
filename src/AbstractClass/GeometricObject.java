package AbstractClass;

import java.util.Date ;

public abstract class GeometricObject {

    private String color = "White";
    private boolean filled ;
    private Date dateCreated ;

     GeometricObject(){
        dateCreated = new Date();
    }
     GeometricObject(String color, boolean filled){
        dateCreated = new Date();
        this.color = color;
        this.filled = filled;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isFilled() {
        return filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    public Date getDateCreated() {
        return dateCreated;
    }

    public void setDateCreated(Date dateCreated) {
        this.dateCreated = dateCreated;
    }

    public double getCircumference(){
         return 7;
    }

    public abstract double getArea();
    public abstract double getPerimeter();
}
