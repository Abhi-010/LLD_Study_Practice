package DesignPattern.AdapterDesignPattern.Adaptor;

import DesignPattern.AdapterDesignPattern.Adaptor.BankAPIAdaptor;
import DesignPattern.AdapterDesignPattern.ThirdPartyAPI.ICICIBankAPI;

public class ICICIBankAPIAdapter implements BankAPIAdaptor {

    private ICICIBankAPI iciciBankAPI = new ICICIBankAPI();


    @Override
    public double getBalance(String accountNumber) {
        System.out.println("you are using ICICI Bank API");
        return 0;
    }

    @Override
    public boolean sendMoney(String fromAccount, String toAccount, double amount) {
        return false;
    }
}
