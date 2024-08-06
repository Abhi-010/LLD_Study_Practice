package Pizza;

import Pizza.AddOns.Cheese;
import Pizza.AddOns.Olive;
import Pizza.AddOns.Paneer;
import Pizza.Base.BBQChicken;
import Pizza.Base.Margherita;

public class Client {
    public static void main(String[] args){

        Pizza o = new Olive(new Paneer(new Cheese(new BBQChicken())));

        System.out.println(o.getCost());
        System.out.println(o.getDescription());

    }
}
