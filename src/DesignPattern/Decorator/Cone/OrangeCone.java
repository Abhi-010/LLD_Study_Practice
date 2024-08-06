package DesignPattern.Decorator.Cone;

import DesignPattern.Decorator.IceCreamConeConstituents;

public class OrangeCone implements IceCreamConeConstituents {
    @Override
    public int getCost() {
        return 20;
    }

    @Override
    public String getConstituents() {
        return "Orange Cone";
    }
}
