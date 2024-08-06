package DesignPattern.AbstractFactory;

//Practical Factory
//This factory gives you the object of UI Factory based on platform

import DesignPattern.AbstractFactory.Factory.AndroidUIFactory;
import DesignPattern.AbstractFactory.Factory.UIFactory;
import DesignPattern.AbstractFactory.Factory.iOSUIFactory;
import DesignPattern.AbstractFactory.Platforms.SupportedPlatforms;


//UIFactoryFactory is a Practical Factory because it gives/returns the object of same class(UIFactory)
public class UiFactoryPraticalFactory {

    public static UIFactory getUiFactoryForPlatform(SupportedPlatforms platform){
        if(platform.equals(SupportedPlatforms.ANDRIOD)){
            return new AndroidUIFactory();
        }
        else if(platform.equals(SupportedPlatforms.IOS)){
            return new iOSUIFactory();
        }
        return null;
   }
}
