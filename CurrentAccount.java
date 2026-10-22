package sidharthsircorejava;

public class CurrentAccount extends BankAccount{
 CurrentAccount (double balance) {
	super(balance);
}
 void deposit(double amt) {
     balance = balance + amt;
     System.out.println("Current Account Deposit: " + amt);
 }

 void withdraw(double amt) {
     if (amt <= balance) {
         balance = balance - amt;
         System.out.println("Current Account Withdraw: " + amt);
     } else {
         System.out.println("Insufficient Balance");
     }
 }

 double calculateInterest() {
     return balance * 0.02;   // 2% interest
 }
}
