package DesignPattern.Observer.subscriber;

import DesignPattern.Observer.Flipkart;

public class InvoiceGenerator implements Subscriber {

    public InvoiceGenerator(){
        Flipkart flipkart = Flipkart.getInstance();
        flipkart.registeredSubscriber(this);
    }

    @Override
    public void announce() {
        generateInvoice();
    }

    public void generateInvoice()
    {
        System.out.println("Generating Invoice");

    }
}
