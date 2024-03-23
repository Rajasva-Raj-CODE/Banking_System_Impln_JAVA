package com.JSP.transcation;

import com.JSP.Account.Account;

public class AccountDepositTransaction {
	
	public void depositTxn(Account a,double amt) 
	{
		if(a.isActive()) 
		{
		a.deposit(amt);
		}
		else
		{
			System.out.println("Inactive account");
    	}
	}
}
