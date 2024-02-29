
package bank;

import java.util.Scanner;

public class Bank{
  private CheckingAccount accountOne;
  private CheckingAccount accountTwo;

  public Bank(){
    accountOne = new CheckingAccount("Zeus", 100, "1",0);
    accountTwo = new CheckingAccount("Hades", 200, "2",0);
  }

  public static void main(String[] args){
    Bank bankOfGods = new Bank();
    System.out.println(bankOfGods.accountOne.getBalance());
      
    System.out.println("Tiene 5000 pesos");
    System.out.println("cuanto dinero desea ingresar (en pesos)");
    Scanner sc = new Scanner(System.in);
    int m=sc.nextInt();
    bankOfGods.accountOne.setBalance(5000+m);
    System.out.println(bankOfGods.accountOne.getBalance());
    System.out.println(bankOfGods.accountOne.getMonthlyInterest());
    
    System.out.println("cuanto dinero desea ingresar (en pesos)");
    int m2=sc.nextInt();
    bankOfGods.accountOne.setBalance(bankOfGods.accountOne.getBalance()+m2);
    System.out.println(bankOfGods.accountOne.getBalance());
    System.out.println(bankOfGods.accountOne.getMonthlyInterest());
    
    System.out.println("cuanto dinero desea ingresar (en pesos)");
    int m3=sc.nextInt();
    bankOfGods.accountOne.setBalance(bankOfGods.accountOne.getBalance()+m3);
    System.out.println(bankOfGods.accountOne.getBalance());
    System.out.println(bankOfGods.accountOne.getMonthlyInterest());
    
    System.out.println("cuanto dinero desea retirar (en pesos)");
    int r1=sc.nextInt();
    bankOfGods.accountOne.setBalance(bankOfGods.accountOne.getBalance()-r1);
    System.out.println(bankOfGods.accountOne.getBalance());
    System.out.println(bankOfGods.accountOne.getMonthlyInterest());
    
    System.out.println("cuanto dinero desea retirar (en pesos)");
    int r2=sc.nextInt();
    bankOfGods.accountOne.setBalance(bankOfGods.accountOne.getBalance()-r2);
    System.out.println(bankOfGods.accountOne.getBalance());
    System.out.println(bankOfGods.accountOne.getMonthlyInterest());
    
    System.out.println("cuanto dinero desea retirar (en pesos)");
    int r3=sc.nextInt();
    bankOfGods.accountOne.setBalance(bankOfGods.accountOne.getBalance()-r3);
    System.out.println(bankOfGods.accountOne.getBalance());
    System.out.println(bankOfGods.accountOne.getMonthlyInterest());
  }
}