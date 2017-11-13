package domain;

import static org.junit.Assert.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class SavingsAccountTest {
	
	private SavingsAccount classUnderTest;
	
	@Before
	public void setUp() throws Exception {
		classUnderTest = new SavingsAccount(0, null);
	}
	
	@Test
    public void account() {
        assertTrue(classUnderTest instanceof SavingsAccount);
    }


	@Test
	public void testGetBalance() {
		double result = 0;
		assertEquals(result, classUnderTest.getBalance());
	}
	
	@Test
	public void testDeposit() {
		double result = 100;
		classUnderTest.deposit(100);
		assertEquals(result, classUnderTest.getBalance());
	}
	
	@Test
	public void testWithdraw() {
		double result = 50;
		classUnderTest.deposit(100);
		classUnderTest.withdraw(50);
		assertEquals(result, classUnderTest.getBalance());
	}
	
	@Test
	public void testAddInterest() {
		double result = 105.11401320407893;
		classUnderTest.deposit(100.00);
		for(int i=0; i<10; i++){
	        classUnderTest.addInterest();
	     }
		assertEquals(result, classUnderTest.getBalance());
	}
}

