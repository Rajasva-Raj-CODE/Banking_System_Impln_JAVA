package com.JSP.Account;

public class SavingAccountCreation {
	
	private static int randnum=10001;
	final private static String acctype="SAV000";
	
	public SavingAccount CreateSavingAccount(String custname,double accbal) {
		
		SavingAccount sav=new SavingAccount(acctype+randnum++,accbal,true,custname);
		return sav;
	}

}
