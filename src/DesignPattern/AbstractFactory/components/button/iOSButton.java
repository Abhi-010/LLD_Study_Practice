package DesignPattern.AbstractFactory.components.button;

public class iOSButton implements Button {
    @Override
    public void changeSize() {
        System.out.println("changing size in iOS");
    }
}
