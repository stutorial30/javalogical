package sidharthsircorejava;

public class ATMMain {

	public static void main(String[] args) {
		Atm a=new Atm();
		Runnable r1=new Runnable() {
			public void run() {
				for(int i=1;i<=5;i++) {
					a.withdraw(100);
				}
			}
		};
		Thread t1=new Thread(r1);
		Runnable r2=new Runnable() {
			public void run() {
				for(int i=1;i<=5;i++) {
					a.deposit(300);
				}
			}
		};
		Thread t2=new Thread(r2);
		t1.start();
		t2.start();
	}

}
