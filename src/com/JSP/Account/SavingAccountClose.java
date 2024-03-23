package com.JSP.Account;

public class SavingAccountClose {
	
	public boolean CloseSavingAccount(SavingAccount sa) {
		
		boolean isSuccess=true;
		sa.setActive(false);
		if(sa.isActive()==true) 
			isSuccess=false;
		return isSuccess;
		}
	}


