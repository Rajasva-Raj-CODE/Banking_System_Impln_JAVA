package com.JSP.Account;

public class SavingAccount extends Account{

	public SavingAccount(String accnum, double accbal, boolean isActive, String custname) {
		super(accnum,accbal,isActive,custname);
	}
	public void deposit(double amt) {
		System.out.println("Depositing Rs"+amt);
		this.setAccbal(this.getAccbal()+amt);
	}

	public  void withdraw(double amt) {
		System.out.println("Withdrwaing Rs"+amt);
		if(amt<this.getAccbal()) {
			this.setAccbal(this.getAccbal()-amt);
		}
		else {
			System.out.println("Failed due to insufficient balance");
		}
	}}