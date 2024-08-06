package Pizza.Base;

import Pizza.Pizza;

public class Farmhouse implements Pizza {

    @Override
    public int getCost() {
        return 150;
    }

    @Override
    public String getDescription() {
        return "Farmhouse";
    }
}
