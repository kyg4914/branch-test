package ex1;

public interface ATMService {
	
	public boolean addAccount(Account account);
	
	public int searchMyBalance(Account account);
	
	public boolean deposit(String accountNumber, int depositMoney);
	
	public boolean withdraw(String accountNumber, int withdrawMoney);
}
