package domain;

import javax.persistence.Entity;

@Entity
public class User {
	private String firstName;
	private String lastName;
	private String email;
	private String username;
	CurrentAccount currentAccount;
	SavingsAccount savingsAccount;
	
	public User(String firstName, String lastName, String email, String username) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.username = username;
	}
	
	public String getFirstName() {
		return firstName;
	}
	
	
	
	public String getLastName() {
		return lastName;
	}
	
	
	
	public String getEmail() {
		return email;
	}
	
	
	
	public String getUsername() {
		return username;
	}
	
	public void openCurrentAccount() {
		currentAccount = new CurrentAccount(0);
    }
	
	public void openSavingsAccount() {
		savingsAccount = new SavingsAccount(0, null);
    }
	
	public void transferToSaving(double amount) {
		currentAccount.balance -= amount;
		savingsAccount.balance += amount;
	}
	
	public void transferToCurrent(double amount) {
		savingsAccount.balance -= amount;
		currentAccount.balance += amount;
	}

}


