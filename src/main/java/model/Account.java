/********************************
 * author: 	Ben Miner
 * class:	CIS 171 Java II
 * date:	September 2020
 * project:	BankAccount
 * file:	Account
 ********************************/
package model;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Account {

	/****************************
	 * 	variables
	 ****************************/
	private String accountID;
	private String firstName;
	private String lastName;
	private double balance;
	/****************************
	 * 	constructor no-arg
	 ****************************/
	public Account() {
		super();
	}
	/****************************
	 * 	constructor w/-arg
	 ****************************/
	public Account(String firstName, String lastName) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
	}
	/****************************
	 * 	setter-getter: accountID
	 ****************************/
	public String getAccountID() {
		return accountID;
	}
	public void setAccountID(String accountID) {
		this.accountID = accountID;
	}
	/****************************
	 * 	setter-getter: firstName
	 ****************************/
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	/****************************
	 * 	setter-getter: lastName
	 ****************************/
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	/****************************
	 * 	setter-getter: balance
	 ****************************/
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	/****************************
	 * 	Withdraw
	 ****************************/
	public void withdraw(double amount) {
		double oldBalance = this.getBalance();
		double newBalance = BigDecimal.valueOf(oldBalance-amount).setScale(2, RoundingMode.HALF_UP).doubleValue();
		this.setBalance(newBalance);
	}
	/****************************
	 * 	Deposit
	 ****************************/
	public void deposit(double amount) {
		double oldBalance = this.getBalance();
		double newBalance = BigDecimal.valueOf(oldBalance+amount).setScale(2, RoundingMode.HALF_UP).doubleValue();
		this.setBalance(newBalance);
	}
}
