package sidharthsircorejava;

public class BankAccMain {

	public static void main(String[] args) {
		BankAccount b1 = new SavingsAccount(10000);
        BankAccount b2 = new CurrentAccount(10000);
        
        b1.deposit(2000);
        b1.withdraw(1000);
        System.out.println("Savings Interest: " + b1.calculateInterest());
        System.out.println("Savings Balance: " + b1.balance);

        System.out.println();

        b2.deposit(3000);
        b2.withdraw(2000);
        System.out.println("Current Interest: " + b2.calculateInterest());
        System.out.println("Current Balance: " + b2.balance);
	}

}
