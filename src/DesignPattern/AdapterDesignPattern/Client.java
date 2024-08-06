package DesignPattern.AdapterDesignPattern;

import DesignPattern.AdapterDesignPattern.Adaptor.ICICIBankAPIAdapter;
import DesignPattern.AdapterDesignPattern.Adaptor.YesBankAPIAdapter;

public class Client {
    public static void main(String[] args) throws InterruptedException {
        //PhonePe phonePe = new PhonePe(new ICICIBankAPIAdapter());
        PhonePe phonePe = new PhonePe(new YesBankAPIAdapter());
        System.out.println(phonePe.doSomething());
        //phonePe.doSomething();
    }
}
