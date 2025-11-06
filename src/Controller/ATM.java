package Controller;

import java.util.ArrayList;
import java.util.List;

import Model.Account;

public class ATM implements ATMService{
	
	List<Account> accountList = new ArrayList<>();
	
	@Override
	public boolean addAccount(Account account) {
		for(Account a:accountList) {
			if(a.getAccountNumber().equals(account.getAccountNumber())) {
				return false;
			}
		}
		accountList.add(account);
		return true;
	}

	@Override
	public int searchMyBalance(Account account) {
		for(Account a:accountList) {
			if(a.getName().equals(account.getName())&&a.getAccountNumber().equals(account.getAccountNumber())) {
				return a.getAccountBalance();
			}
		}
		return -1;
	}

	@Override
	public boolean deposit(String accountNumber, int depositMoney) {
		
		if(depositMoney > 0) {
			for(Account a:accountList) {
				if(a.getAccountNumber().equals(accountNumber)) {
					a.setAccountBalance(a.getAccountBalance() + depositMoney);
					return true;
				}
			}
		}
		
		return false;
	}

	@Override
	public boolean withdraw(String accountNumber, int withdrawMoney) {
		if(withdrawMoney > 0) {
			for(Account a:accountList) {
				if(a.getAccountNumber().equals(accountNumber)) {
					if(a.getAccountBalance() - withdrawMoney < 0) {
						return false;
					}else {
						a.setAccountBalance(a.getAccountBalance() - withdrawMoney);
						return true;
					}
				}
			}
		}
		return false;
	}
	
}
