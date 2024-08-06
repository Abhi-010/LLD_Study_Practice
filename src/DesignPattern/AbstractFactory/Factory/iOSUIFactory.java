package DesignPattern.AbstractFactory.Factory;

import DesignPattern.AbstractFactory.components.Dropdown.iOSDropdown;
import DesignPattern.AbstractFactory.components.button.iOSButton;
import DesignPattern.AbstractFactory.components.menu.iOSMenu;

public class iOSUIFactory implements UIFactory {
    @Override
    public iOSButton createButton() {
        return new iOSButton();
    }

    @Override
    public iOSMenu createMenu() {
        return new iOSMenu();
    }

    @Override
    public iOSDropdown createDropdown() {
        return new iOSDropdown();
    }
}
