package application;

import entities.Account;

public class App {

    public static void main(String[] args) {
        
        // crio uma conta
        Account acc1 = new Account();
        Account acc2 = new Account();

        acc1.setId("123-A");
        acc1.holder = "Joao da Silva";
        acc1.setBalance(1000.0);

        acc1.deposit(200.0);
        
        System.out.println("Balance = $" + acc1.getBalance());
        System.out.println("-----------------");
        
        acc1.deposit(200.0);
        
        System.out.println("Balance = $" + acc1.balance);
        System.out.println("-----------------");

        acc1.withdraw(100.0);
        
        System.out.println("Balance = $" + acc1.balance);
        System.out.println("-----------------");
        
        acc1.withdraw(500.0);
        
        System.out.println("Balance = $" + acc1.balance);
        System.out.println("-----------------");

        double quantia = 175.0;
        acc1.transfer(quantia, acc2);

        System.out.println("Balance ACC1= $" + acc1.balance);
        System.out.println("-----------------");
        System.out.println("Balance ACC2= $" + acc2.balance);
        System.out.println("-----------------");

        
    }
}
