package DesignPattern.AbstractFactory.components.button;

public class AndroidButton implements Button {


    @Override
    public void changeSize() {
        System.out.println("changing size in Andriod");
    }
}
