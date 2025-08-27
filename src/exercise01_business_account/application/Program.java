package exercise01_business_account.application;

import exercise01_business_account.entities.Account;
import exercise01_business_account.entities.BusinessAccount;
import exercise01_business_account.entities.SavingsAccount;

public class Program {
    public static void main(String[] args) {
        
        Account acc1 = new Account(1001, "Alex", 1000.0);
        Account acc2 = new SavingsAccount(1002, "Maria", 1000.0, 0.01);
        Account acc3 = new BusinessAccount(1003, "Bob", 1000.0, 500.00);

        acc1.withdraw(200);
        System.out.println( acc1.getBalance());
        acc2.withdraw(200);
        System.out.println( acc2.getBalance());
        acc3.withdraw(200.0);
        System.out.println(acc3.getBalance());
    }
}
