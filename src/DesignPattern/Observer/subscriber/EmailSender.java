package DesignPattern.Observer.subscriber;

import DesignPattern.Observer.Flipkart;

public class EmailSender implements Subscriber {

    public EmailSender(){
        Flipkart flipkart = Flipkart.getInstance();
        flipkart.registeredSubscriber(this);
    }
    @Override
    public void announce() {
        sendEmail();
    }
    public void sendEmail(){
        System.out.println("Sending Email");
    }

}
