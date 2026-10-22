package sidharthsircorejava;

public class DeadLock {
String apple="apple";
String orange="orange";
public void disp() {
	synchronized(apple) {
		System.out.println("apple of display");
		synchronized(orange) {
			System.out.println("orange of display");
		}
	}
}
public void info() {
	synchronized(orange) {
		System.out.println("orange of info");
	}synchronized(apple) {
		System.out.println("apple of info");
	}
}
}
