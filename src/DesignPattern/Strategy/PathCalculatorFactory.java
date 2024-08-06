package DesignPattern.Strategy;

import DesignPattern.Strategy.strategyinterface.BikePathCalculator;
import DesignPattern.Strategy.strategyinterface.CarPathCalculator;
import DesignPattern.Strategy.strategyinterface.PathCalculatorStrategy;
import DesignPattern.Strategy.strategyinterface.WalkPathCalculator;

public class PathCalculatorFactory {

    public static PathCalculatorStrategy getPathCalculatorByMode(SupportedWays mode){
        if(mode.equals(SupportedWays.CAR)){
            return new CarPathCalculator();
        }
        else if(mode.equals(SupportedWays.WALK)){
            return new WalkPathCalculator();
        }
        return  new BikePathCalculator();
    }
}
