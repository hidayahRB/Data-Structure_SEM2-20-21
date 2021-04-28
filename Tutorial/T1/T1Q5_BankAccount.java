/*
Assume the existence of an interface, Account, with the following methods:
• deposit: accepts an integer parameter and returns an integer
• withdraw: accepts an integer parameter and return a Boolean

Define a class, BankAccount, that implements the above interface and has the following members:
• an instance variable named balance
• a constructor that accepts an integer that is used to initialize the instance variable
• an implementation of the deposit method that adds its parameter to the balance variable. The new balance is returned as the value of the method.
• an implementation of the withdraw method that checks whether its parameter is less than or equal to the balance and if so, 
  decreases the balance by the value of the parameter and returns true; 
  otherwise, it leaves the balance unchanged and returns false.
  */

public class BankAccount implements Account{
   private int balance;
   public BankAccount(int theBalance){
      balance = theBalance;
   }
 
   public int deposit(int amountOfDeposit){
      balance = balance + amountOfDeposit;
      return balance;
   }
 
   public boolean withdraw(int amountOfWithdrawal){
      if (amountOfWithdrawal <= balance){
          balance = balance - amountOfWithdrawal;
          return true;
      }else{
         return false;
      }
   }
}

