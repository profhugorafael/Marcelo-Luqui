package entities;

public class Account {

  // atributos
  private String id;
  private String holder;
  private double balance;

  // getters and setters
  public double getBalance() {
    return balance;
  }

  public void setBalance(double balance) {
    this.balance = balance;
  }
  
  public String getId() {
    return id;
  }
  
  public void setId(String id) {
    this.id = id;
  }

  public String getHolder() {
    return holder;
  }
  
  public void setHolder(String holder) {
    this.holder = holder;
  }

  // métodos
  
  // depositar
  public boolean deposit(double amount) {
    // balance = balance + amount;
    balance += amount;
    return true;
  }

  // sacar
  public boolean withdraw(double amount) {

    if (balance >= amount) {
      balance -= amount;
      return true;
    }

    return false;
  }

  // transferir
  public boolean transfer(double amount, Account destinationAccount) {

    if (withdraw(amount)) {
      destinationAccount.deposit(amount);
      return true;
    }

    return false;
  }

}
