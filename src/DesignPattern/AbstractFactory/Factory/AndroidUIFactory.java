package DesignPattern.AbstractFactory.Factory;

import DesignPattern.AbstractFactory.components.Dropdown.AndriodDropdown;
import DesignPattern.AbstractFactory.components.button.AndroidButton;
import DesignPattern.AbstractFactory.components.menu.AndroidMenu;

public class AndroidUIFactory implements UIFactory {

    @Override
    public AndroidButton createButton() {
        return new AndroidButton();
    }

    @Override
    public AndroidMenu createMenu() {
        return new AndroidMenu();
    }

    @Override
    public AndriodDropdown createDropdown() {
        return new AndriodDropdown();
    }
}
