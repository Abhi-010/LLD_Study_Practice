package Pizza.AddOns;

import Pizza.Pizza;

public class Olive implements Pizza {

    Pizza pizza;

    public Olive(Pizza pizza){
        this.pizza = pizza;
    }

    @Override
    public int getCost() {
        return 20 + pizza.getCost();
    }

    @Override
    public String getDescription() {
        return pizza.getDescription() + " + " + "Olive";
    }
}
