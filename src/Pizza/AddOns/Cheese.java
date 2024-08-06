package Pizza.AddOns;

import Pizza.Pizza;

public class Cheese implements Pizza {
    Pizza pizza ;
    public Cheese(Pizza pizza){
        this.pizza = pizza;
    }

    @Override
    public int getCost() {
        return pizza.getCost() + 80;
    }

    @Override
    public String getDescription() {
        return pizza.getDescription() +  " + " + "Cheese";
    }
}
