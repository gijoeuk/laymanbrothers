package domain;

import static org.junit.Assert.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Before;
import org.junit.Test;


public class UserTest {


	private User classUnderTest;
	
	@Before
	public void setUp() throws Exception {
		classUnderTest = new User("Joe", "Ingram", "joe@joe.com", "gijoe");
	}

	@Test
    public void user() {
        assertTrue(classUnderTest instanceof User);
    }
	
	@Test
	public void testGetFirstName() {
		String result = "Joe";
		assertEquals(result, classUnderTest.getFirstName());
	}
	
	@Test
	public void testGetLastName() {
		String result = "Ingram";
		assertEquals(result, classUnderTest.getLastName());
	}
	
	@Test
	public void testGetEmail() {
		String result = "joe@joe.com";
		assertEquals(result, classUnderTest.getEmail());
	}
	
	@Test
	public void testGetUsername() {
		String result = "gijoe";
		assertEquals(result, classUnderTest.getUsername());
	}
	
	@Test
	public void testOpenCurrentAccount() {
		classUnderTest.openCurrentAccount();
		assertTrue(classUnderTest.currentAccount instanceof CurrentAccount);
	}
	
	@Test
	public void testOpenSavingsAccount() {
		classUnderTest.openSavingsAccount();
		assertTrue(classUnderTest.savingsAccount instanceof SavingsAccount);
	}
	
	@Test //test 
	public void testTransferToSavings() {
		double result = 50.00;
		classUnderTest.openSavingsAccount();
		classUnderTest.openCurrentAccount();
		classUnderTest.currentAccount.deposit(150.00);
		classUnderTest.transferToSaving(100.00);
		assertEquals(result, classUnderTest.currentAccount.getBalance());
	}
	
	
	@Test
	public void testTransferToCurrent() {
		double result = 50.00;
		classUnderTest.openSavingsAccount();
		classUnderTest.openCurrentAccount();
		classUnderTest.savingsAccount.deposit(150.00);
		classUnderTest.transferToCurrent(100.00);
		assertEquals(result, classUnderTest.savingsAccount.getBalance());
	}

}

