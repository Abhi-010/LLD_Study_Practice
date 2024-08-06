package DesignPattern.Strategy.strategyinterface;

import DesignPattern.Strategy.strategyinterface.PathCalculatorStrategy;

public class CarPathCalculator implements PathCalculatorStrategy {
    @Override
    public void findPath(String source, String destination) {
        System.out.println("moving from " + source + " to " + destination + " via Car");
    }
}
