package sidharthsircorejava;

public class Atm {
int bal=1000;
public synchronized void withdraw(int amt) {
	if(bal<amt) {
		System.out.println("insufficent bal plz deposit and try again");
		try {
			wait();
		}catch(InterruptedException e){
			e.printStackTrace();
		}
	}
	bal -=amt;
	System.out.println("after withdrawal final balance:"+bal);
}
public synchronized void deposit(int amt) {
	bal +=amt;
	System.out.println("after withdrawal final balance:"+bal);
	notify();
}
}
