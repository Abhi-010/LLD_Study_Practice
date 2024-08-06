package DesignPattern.Observer;

import DesignPattern.Observer.subscriber.EmailSender;
import DesignPattern.Observer.subscriber.InvoiceGenerator;

public class Client {
    public static void main(String[] args) {

        EmailSender emailSender = new EmailSender();
        InvoiceGenerator invoiceGenerator = new InvoiceGenerator();

        Flipkart flipkart = Flipkart.getInstance();
        flipkart.orderPlaced();

        System.out.println("Unregistered Email Sender");
        flipkart.unregisteredSubscriber(emailSender);
        flipkart.orderPlaced();
    }
}
