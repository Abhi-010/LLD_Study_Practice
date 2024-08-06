package DesignPattern.Strategy;

public class client {
    public static void main(String[] args) {
        GoogleMaps googleMaps = new GoogleMaps();
        googleMaps.findPath("railway station","airport",SupportedWays.CAR);
    }
}
