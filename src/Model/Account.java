package Model;

public class Account {

	private String name;
	private String accountNumber;
	private int accountBalance;
	
	public Account(String name, String accountNumber, int accountBalance) {
		super();
		this.name = name;
		this.accountNumber = accountNumber;
		this.accountBalance = accountBalance;
	}
	
	public Account(String name, String accountNumber) {
		super();
		this.name = name;
		this.accountNumber = accountNumber;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}
	public int getAccountBalance() {
		return accountBalance;
	}
	public void setAccountBalance(int accountBalance) {
		this.accountBalance = accountBalance;
	}
	
}
