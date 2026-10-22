package sidharthsircorejava;

public abstract class BankAccount {
	double balance;
	public BankAccount(double balance) {
		this.balance=balance;
	}
	abstract void deposit(double amt); 
	abstract void  withdraw(double amt);
	abstract double calculateInterest();
}
