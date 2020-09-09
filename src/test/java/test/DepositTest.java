/********************************
 * author: 	Ben Miner
 * class:	CIS 171 Java II
 * date:	September 2020
 * project:	BankAccount
 * file:	DepositTest
 ********************************/
package test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import model.Account;

public class DepositTest {
	Account account = new Account("Ben", "Miner");
	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void testDeposit_1() {
		account.deposit(500.0);
		assertEquals(500.0,account.getBalance(),0.0);
	}
	@Test
	public void testDeposit_2() {
		account.deposit(257.21);
		account.deposit(516.37);
		assertEquals(773.58,account.getBalance(),0.00);
	}
	@Test
	public void testDepositAndWithdraw() {
		account.deposit(257.21);
		account.deposit(516.37);
		account.withdraw(463.12);
		account.withdraw(915.02);
		account.deposit(605.56);
		assertEquals(1.0,account.getBalance(),0.0);
	}
}
