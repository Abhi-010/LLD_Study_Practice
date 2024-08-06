package Pizza.Base;

import Pizza.Pizza;

public class Margherita implements Pizza {

    @Override
    public int getCost() {
        return 200;
    }

    @Override
    public String getDescription() {
        return "Margherita";
    }
}
