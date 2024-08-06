package DesignPattern.AdapterDesignPattern.Adaptor;

public interface BankAPIAdaptor {

    double getBalance(String accountNumber);

    boolean sendMoney(String fromAccount,
                      String toAccount,
                      double amount);
}
