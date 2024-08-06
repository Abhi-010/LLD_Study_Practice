package DesignPattern.AdapterDesignPattern;

import DesignPattern.AdapterDesignPattern.Adaptor.BankAPIAdaptor;

public class PhonePe {
    BankAPIAdaptor bankAPI;
    public PhonePe(BankAPIAdaptor bankAPI){
        this.bankAPI = bankAPI;
    }
    double doSomething() throws InterruptedException{
        double currentBalance = bankAPI.getBalance("accNum");
        Thread.sleep(25*24);
        return currentBalance*2;
    }
}
