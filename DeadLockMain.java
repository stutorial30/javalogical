package sidharthsircorejava;

public class DeadLockMain {

	public static void main(String[] args) {
		DeadLock t1=new DeadLock();
		Runnable r1=new Runnable() {
			public void run() {
				t1.disp();
			}
		};
		Thread t=new Thread(r1);
		Runnable r2=new Runnable() {
			public void run() {
				t1.info();
			}
		};
		Thread t2=new Thread(r2);
		t.start();
		t2.start();
	}

}
