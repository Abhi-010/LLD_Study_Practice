package DesignPattern.Flyweight;

public class FlyWeightTree {

    private String color;
    private int height;

    // private int x;
    // private int y;

    public FlyWeightTree(String color) {
        this.color = color;
        this.height = 6;
        //this.x = x;
        //this.y = y;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

}
