package DesignPattern.Decorator;

import DesignPattern.Decorator.Cone.OrangeCone;

public class Client {

    public static void main(String[] args) {

        IceCreamConeConstituents iceCream = new OrangeCone();
        IceCreamConeConstituents iceCream1 = new VanillaScoop(iceCream);

        if(iceCream1 instanceof VanillaScoop){
            System.out.println("Type of Vanilla Scoop");
        }
        else{
            System.out.println("Dont know type");
        }

        System.out.println(iceCream.getConstituents());
        System.out.println(iceCream.getCost());

        System.out.println(iceCream1.getCost());
        System.out.println(iceCream1.getConstituents());

        /*IceCreamConeConstituents iceCreamConeConstituents =
                new VanillaScoop(
                        new StrawberryScoop(
                                new ChocoChips(
                                        new ChocolateCone()
                                )
                        )
                );

        System.out.println(iceCreamConeConstituents.getConstituents());
        System.out.println(iceCreamConeConstituents.getCost());*/
    }
}
