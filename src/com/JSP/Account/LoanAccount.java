package com.JSP.Account;

public class LoanAccount extends Account {
	
	
	 private int tenure;
	
	
	public LoanAccount(String custname, double accbal, String accnum, int tenure, boolean isActive) {
		super(custname,accbal,isActive,custname);
		this.tenure=tenure;	
	}
	
	public int getTenure() {
		return tenure;
	}


	public void setTenure(int tenure) {
		this.tenure = tenure;
	}
	
	
	public void deposit(double amt) {
    	System.out.println("Depositing Rs"+amt);
    	this.setAccbal(this.getAccbal()-amt);
    }
	
	public  void withdraw(double amt) {
		System.out.println("Withdrwaing Rs"+amt);
		this.setAccbal(this.getAccbal()+amt);
}
}