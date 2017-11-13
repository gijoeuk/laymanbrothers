package domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity
public class SavingsAccount {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	private String name;
	double balance;
	private Transaction[] transactions;

	public SavingsAccount(double balance, Transaction[] transactions) {
		super();
		this.balance = balance;
		this.transactions = transactions;
	}

	public long getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}
	
	public Transaction[] getTransactions() {
		return transactions;
	}
	
	public void deposit(double amount) {
		balance += amount;
	}
	
	public void withdraw(int amount) {
		balance -= amount;
	}
	
	public void addInterest() {
		balance *= 1.005;		
	}
	
}

