/*
An Account class was specified in Question 3. Design a new Account1 class as follows:
■ Add a new data field name of the String type to store the name of the customer.
■ Add a new constructor that constructs an account with the specified name, id, and balance.
■ Add a new data field named transactions whose type is ArrayList that stores the transaction
for the accounts. Each transaction is an instance of the Transaction class. 
■ Modify the withdraw and deposit methods to add a transaction to the transactions array list.
■ All other properties and methods are the same as in Question 3.

Write a test program that creates an Account1 object with annual interest rate 1.5%, balance
1000, id 1122, and name George. Deposit $30, $40, and $50 to the account and withdraw $5, $4,
and $2 from the account. Print an account summary that shows account holder name, interest
rate, balance, and all transactions.
Page
*/

public class TesterAccount {
    public static void main(String[] args) {
        // Create an Account1 object
        Account1 acc2 = new Account1("George", 1122, 1000);
	      // Set annual interest rate to 1.5%
	      acc2.setAnnualInterestRate(1.5);
	      // Deposit $30, $40, and $50 
	      acc2.deposit(30);
	      acc2.deposit(40);
	      acc2.deposit(50);
	      // withdraw $5, $4, and $2 
	      acc2.withdraw(5);
	      acc2.withdraw(4);
	      acc2.withdraw(2);
	      // Print an acc summary
	      System.out.println("       Account Summary"); 
	      System.out.println("************************************");
	      System.out.println("Account holder name: " + acc2.getName());
	      System.out.println("Interest rate: " + acc2.getAnnualInterestRate());
	      System.out.printf("Balance: $%.2f\n", acc2.getBalance());
	      System.out.println("\n     List of transactions");
	      System.out.println("************************************");
	      for (int i = 0; i < acc2.getTransactions().size(); i++) {
            System.out.println("Date: " + (acc2.getTransactions()).get(i).getDate());
            System.out.println("Type: " + (acc2.getTransactions()).get(i).getType());
            System.out.println("Amount: " + (acc2.getTransactions()).get(i).getAmount());
            System.out.println("Balance: " + (acc2.getTransactions()).get(i).getBalance());
            System.out.println("Description: " + (acc2.getTransactions()).get(i).getDescription());
            System.out.println();
	      }
    }
    
}


import java.util.Date;
import java.util.ArrayList;
public class Account1 {
	// Data fields
	private String name;
	private int id;
	private double balance;
	private static double annualInterestRate;
	private Date dateCreated;
	private ArrayList<Transaction> transactions;

	// Constructors
	// Default Account
	Account1() {
            name = "";
            id = 0;
            balance = 0;
            annualInterestRate = 0;
            dateCreated = new Date(); 
            transactions = new ArrayList<Transaction>();
	}

	// Account with specified initials
	Account1(int id, double balance) {
            name = "";
            this.id = id;
            this.balance = balance;
            dateCreated = new Date();
            transactions = new ArrayList<Transaction>();
	}

	Account1(String name, int id, double balance) {
            this(id, balance);
            this.name = name;
	}   

	// Mutator methods
	public void setName(String name) {
            this.name = name;
	}
        public void setId(int id) {
            this.id = id;
	}
	public void setBalance(double balance) {
            this.balance = balance;
	}
	public void setAnnualInterestRate(double annualInterestRate) {
            this.annualInterestRate = annualInterestRate;
	}

	// Accessor methods
	public String getName() {
            return name;
	}
	public int getId() {
            return id;
	}
	public double getBalance() {
            return balance;
	}
	public double getAnnualInterestRate() {
            return annualInterestRate;
	}
	public String getDateCreated() {
            return dateCreated.toString();
	}
	public double getMonthlyInterestRate() {
            return annualInterestRate / 12;
	}

	// Methods
	public double getMonthlyInterest() {
            return balance * (getMonthlyInterestRate() / 100);
	}
	public void withdraw(double amount) {
            balance -= amount;
            transactions.add(new Transaction('W', amount, balance,"Withdrawal from account"));
	}
	public void deposit(double amount) {
            balance += amount;
            transactions.add(new Transaction('D', amount, balance, "Deposit to account"));
	}
	public ArrayList<Transaction> getTransactions() {
            return transactions;
	}
}


public class Transaction {
	// Data fields
	private java.util.Date date;
	private char type;
	private double amount;
	private double balance;
	private String description;

	// Constructor
	public Transaction(char type, double amount, double balance, String description) {
            date = new java.util.Date();
            this.type = type;
            this.amount = amount;
            this.balance = balance;
            this.description = description;
	}

	// Methods
	public String getDate() {
		return date.toString();
	}
        
        // Mutator and Accessor
	public void setType(char type) {
		this.type = type;
	}
	public char getType() {
		return type;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}
	public double getAmount() {
		return amount;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}
	public double getBalance() {
		return balance;
	}

	public void setDescription(String description) {
		this.description = description;
	}
	public String getDescription() {
		return description;
	}
}

