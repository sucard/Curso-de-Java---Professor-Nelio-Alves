package sistemaBancario.entities;

public class Client {

	private int accountNumber;
	private String accountHolderName;
	private double balance;
	private static final double TAX = 5.00;
	
	public Client(int accountNumber, String accountHolderName) {
		this.accountNumber = accountNumber;
		this.accountHolderName = accountHolderName;
	}
	
	public Client(int accountNumber, String accountHolderName, double initialDeposit) {
		this.accountNumber = accountNumber;
		this.accountHolderName = accountHolderName;
		bankDeposit(initialDeposit);
	}
	
	public int getAccountNumber() {
		return accountNumber;
	}
	
	public String getAccountHolderName() {
		return accountHolderName;
	}
	
	public void setAccountHolderName(String accountHolderName) {
		this.accountHolderName = accountHolderName;
	}
	
	public double getBalance() {
		return balance;
	}
	
	public void bankDeposit(double amount) {
		balance += amount;
	}
	
	public void withdrawal(double amount) {
		amount += TAX;
		balance -= amount;
	}
	
	public String toString() {
		return "Account: "
				+ accountNumber
				+", Holder: "
				+ accountHolderName
				+", Balance: $ "
				+ String.format("%.2f", balance);
	}
	
	
	
	
	

}
