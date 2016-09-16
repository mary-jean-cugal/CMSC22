public class Account{

	int accountNumber;
	double balance;
	
	public Account(int accountNumber, double balance){
		this.balance = balance;
		this.accountNumber = accountNumber;
	}

	public Account(int accountNumber){
		this.accountNumber = accountNumber;
		balance = 0.0;
	}
	public int getAccountNumber(){
		return accountNumber;
	}
	public double getBalance(){
		return balance;
	}
	public void setBalance(double balance){
		this.balance = balance;
	}
	public void credit(double amount){
		balance = balance + amount;
	}
	public void debit(double amount){
		if (balance >= amount){
			balance = balance - amount;
		}
		else{
			throw new IllegalArgumentException("amount withdrawn exceeds the current balance");
		}
	}
	public String toString(){
		return String.format("A/C no: %d ,Balance: $ %.2f", accountNumber, balance);
	}
}