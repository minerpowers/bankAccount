/********************************
 * author: 	Ben Miner
 * class:	CIS 171 Java II
 * date:	September 2020
 * project:	BankAccount
 * file:	WithdrawTest
 ********************************/
package test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import model.Account;

public class withdrawTest {
	Account account = new Account("Ben", "Miner");
	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void testAccountWithdraw_1() {
		account.setBalance(1000);
		account.withdraw(500.01);
		assertEquals(499.99,account.getBalance(),0.0);
	}
	
	@Test
	public void testAccountWithdraw_2() {
		account.setBalance(1000.00);
		account.withdraw(719.57);
		assertEquals(280.43,account.getBalance(),0.00);
	}
	@Test
	public void testAccountWithdraw_3() {
		account.setBalance(1000);
		account.withdraw(58);
		assertEquals(942,account.getBalance(),0.0);
	}
	@Test
	public void testAccountWithdraw_4() {
		account.setBalance(1000);
		account.withdraw(500);
		account.withdraw(719);
		account.withdraw(58);
		assertEquals(-277,account.getBalance(),0.0);
	}
}
