package DesignPattern.AbstractFactory;

import DesignPattern.AbstractFactory.Factory.UIFactory;
import DesignPattern.AbstractFactory.Platforms.SupportedPlatforms;

public class Flutter {
     public void setTheme(){
         System.out.println("Setting Theme");
     }
     public void setRefreshRate(){
         System.out.println("Setting refresh rate");
     }

     //Flutter class can have many more methods and attributes.

     public UIFactory createUIFactory(SupportedPlatforms platform){
         return UiFactoryPraticalFactory.getUiFactoryForPlatform(platform);
     }
}
