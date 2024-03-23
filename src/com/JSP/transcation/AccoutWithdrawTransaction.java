package com.JSP.transcation;

import com.JSP.Account.Account;

public class AccoutWithdrawTransaction
{
	public void withdrawTxn(Account a,double amt)
	{
		if(a.isActive())
		{
			a.withdraw(amt);
		}
		else
		{
			System.out.println("Inactive Account");
		}
	}

}
