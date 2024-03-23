package com.JSP.Account;

public class LoanAccountClose {
public boolean CloseLoanAccount(LoanAccount la) {
		
		boolean isSuccess=true;
		la.setActive(false);
		if(la.isActive()==true) 
			isSuccess=false;
		return isSuccess;
		}

}
