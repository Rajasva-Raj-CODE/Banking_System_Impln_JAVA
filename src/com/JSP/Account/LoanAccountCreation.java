package com.JSP.Account;

public class LoanAccountCreation {
	
	private static int randnum=10001;
	final private static String acctype="SAV000";
	
	public LoanAccount CreateLoanAccount(String custname, double loanamt,int tenure) {
		
		LoanAccount la=new LoanAccount(acctype+randnum++,loanamt,custname,tenure,true);
		return la;
	}
	

}
