package DesignPattern.Observer;

import DesignPattern.Observer.subscriber.Subscriber;

import java.util.ArrayList;
import java.util.List;

public class Flipkart {

    private static Flipkart instance;

    private List<Subscriber> subscribers = new ArrayList<>();

    //this ensures
    private Flipkart(){

    }

    public  static Flipkart getInstance(){
        if(instance == null){
            instance = new Flipkart();
        }
        return instance;
    }

    public void registeredSubscriber(Subscriber subscriber){
        subscribers.add(subscriber);
    }

    void unregisteredSubscriber(Subscriber subscriber){
        subscribers.remove(subscriber);
    }
    
    public void orderPlaced(){
        //ap.notify;
        //ig.generatenotify;
        //voilate OCP and SRP
        for(Subscriber subscriber:subscribers){
            subscriber.announce();
        }
    }
}
