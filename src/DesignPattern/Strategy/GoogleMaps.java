package DesignPattern.Strategy;

import DesignPattern.Strategy.strategyinterface.PathCalculatorStrategy;

public class GoogleMaps {

        public void findPath(String from, String to, SupportedWays mode){
                PathCalculatorStrategy pathCalculator = PathCalculatorFactory.getPathCalculatorByMode(mode);
                pathCalculator.findPath(from,to);
        }
}
