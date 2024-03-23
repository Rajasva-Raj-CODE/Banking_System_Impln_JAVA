package com.JSP.transcation;

import com.JSP.Account.Account;
import com.JSP.Account.LoanAccount;
import com.JSP.Account.SavingAccount;

public class ViewAccountBalance {
	
	/*public void viewBalance(SavingAccount sa){
	System.out.println("Account Balnace RS:"+sa.getAccbal());
	}
	public void viewBalance(LoanAccount la){
		System.out.println("Account Balnace RS:"+la.getAccbal());
		}*/
	
	public void viewBalance(Account a) {
		if(a.isActive()) {
		System.out.println("Account Balance:"+a.getAccbal());
	}
		else {
			System.out.println("Inactive account");
			
		}

}
}
