package Tutorial3;
class BankAccount{
	private String accountNumber;
	private double balance;
	public String getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	
	public void deposit(double amount) {
		if (amount>0) {
			this.balance+=amount;
		}else {
			System.out.println("Amount cannot be negative");
		}
	}
	public void withdraw(double amount) {
		if (amount<balance) {
			this.balance-=amount;
		}else {
			System.out.println("Amount cannot be negative");
		}
	}
}
public class Task1 {
public static void main(String[] args) {
	BankAccount bankAccount=new BankAccount();
	System.out.println("current balance: "+bankAccount.getBalance());
	bankAccount.deposit(10000);
	System.out.println("current balance: "+bankAccount.getBalance());
	bankAccount.withdraw(5000);
	System.out.println("current balance: "+bankAccount.getBalance());
}
}
