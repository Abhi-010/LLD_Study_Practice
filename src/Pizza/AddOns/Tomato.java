package Pizza.AddOns;

import Pizza.Pizza;

public class Tomato implements Pizza {

    Pizza pizza;
    public Tomato(Pizza pizza){
        this.pizza = pizza;
    }

    @Override
    public int getCost() {
        return pizza.getCost() + 30;
    }

    @Override
    public String getDescription() {
        return pizza.getDescription() + " + " + "Tomato";
    }
}
