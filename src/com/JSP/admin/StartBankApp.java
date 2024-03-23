package com.JSP.admin;

import com.JSP.Account.LoanAccount;
import com.JSP.Account.LoanAccountClose;
import com.JSP.Account.LoanAccountCreation;
import com.JSP.Account.SavingAccount;
import com.JSP.Account.SavingAccountClose;
import com.JSP.Account.SavingAccountCreation;
import com.JSP.transcation.AccountDepositTransaction;
import com.JSP.transcation.AccoutWithdrawTransaction;
import com.JSP.transcation.FundTransferTransaction;
import com.JSP.transcation.ViewAccountBalance;

public class StartBankApp {
	public static void main(String[] args) {
		
		System.out.println("WELECOME TO CITY BANK SYSTEM");
		
		SavingAccountCreation sac=new SavingAccountCreation();
		SavingAccountClose saclose=new SavingAccountClose();
		LoanAccountCreation lac=new LoanAccountCreation();
		LoanAccountClose laclose=new LoanAccountClose();

		ViewAccountBalance vab=new ViewAccountBalance();
		AccountDepositTransaction adt=new AccountDepositTransaction();
		AccoutWithdrawTransaction awt=new AccoutWithdrawTransaction();
		FundTransferTransaction ftt=new FundTransferTransaction();
		
		SavingAccount sa1=sac.CreateSavingAccount("Raj", 10000.00);
		vab.viewBalance(sa1);
		adt.depositTxn(sa1, 50000);
		vab.viewBalance(sa1);
		awt.withdrawTxn(sa1, 2000.00);
		vab.viewBalance(sa1);
		
		SavingAccount sa2=sac.CreateSavingAccount("Tejasvi",21000);
		vab.viewBalance(sa2);
		ftt.fundTransfer(sa1, sa2, 11000);
		vab.viewBalance(sa1);
		vab.viewBalance(sa2);
		
		LoanAccount la=lac.CreateLoanAccount("Raj", 70000.00, 20);
		vab.viewBalance(la);
		adt.depositTxn(la, 50000);
		vab.equals(la);
		
		saclose.CloseSavingAccount(sa1);
		sa1.deposit(2000.00);
		vab.viewBalance(sa1);
		
	}




}
