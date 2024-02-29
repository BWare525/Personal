package bank;

public class CheckingAccount{
  private String name;
  private int balance;
  private String id;
  private double interestRate;
  private int ingreso;

  public CheckingAccount(String inputName, int inputBalance, String inputId, int inputMoney){
    this.name = inputName;
    this.balance = inputBalance;
    this.id = inputId;
    this.interestRate = 0.02;
    this.ingreso=inputMoney;
  }

  public void setBalance(int newBalance){
    this.balance = newBalance+this.ingreso;
  }
    
  public int getBalance(){
    return this.balance;
  }

  public double getMonthlyInterest(){
    return this.interestRate * this.balance;
  }
}