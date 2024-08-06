package DesignPattern.Decorator.Cone;

import DesignPattern.Decorator.IceCreamConeConstituents;

public class ChocolateCone implements IceCreamConeConstituents {
    @Override
    public int getCost() {
        return 0;
    }

    @Override
    public String getConstituents() {
        return null;
    }
}
