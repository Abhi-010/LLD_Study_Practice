package DesignPattern.AdapterDesignPattern.Adaptor;

import DesignPattern.AdapterDesignPattern.Adaptor.BankAPIAdaptor;
import DesignPattern.AdapterDesignPattern.ThirdPartyAPI.YesBankAPI;

public class YesBankAPIAdapter implements BankAPIAdaptor {
    private YesBankAPI yesBankAPI = new YesBankAPI();
    @Override
    public double getBalance(String accountNumber) {
        System.out.println("You are using YesBankAPIAdaptor");
        return 0;
    }

    @Override
    public boolean sendMoney(String fromAccount, String toAccount, double amount) {
        return false;
    }
}
