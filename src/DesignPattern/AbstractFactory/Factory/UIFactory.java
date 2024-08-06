package DesignPattern.AbstractFactory.Factory;

import DesignPattern.AbstractFactory.components.Dropdown.Dropdown;
import DesignPattern.AbstractFactory.components.button.Button;
import DesignPattern.AbstractFactory.components.menu.Menu;

public interface UIFactory {
    public Button createButton();
    public Menu createMenu();
    public Dropdown createDropdown();
}
