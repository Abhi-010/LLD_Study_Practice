package DesignPattern.AbstractFactory;

import DesignPattern.AbstractFactory.Factory.UIFactory;
import DesignPattern.AbstractFactory.Platforms.SupportedPlatforms;
import DesignPattern.AbstractFactory.components.button.Button;
import DesignPattern.AbstractFactory.components.menu.Menu;

public class Client {
    public static void main(String[] args) {
        Flutter flutter = new Flutter();
        UIFactory uiFactory = flutter.createUIFactory(SupportedPlatforms.ANDRIOD);
        Button button = uiFactory.createButton();
        button.changeSize();

       Menu menu = uiFactory.createMenu();
       menu.changeMenu();
    }
}