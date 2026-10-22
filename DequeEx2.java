package sidharthsircorejava;
import java.util.Deque;
import java.util.LinkedList;
public class DequeEx2 {
	public static void main(String[] args) {
		Deque<String>n=new LinkedList<String>();
	    n.push("rohit sharma");
	    n.push("ms dhoni");
	    n.push("virat");
	    n.push("kl rahul");
	    n.push("bumrah");
	    n.push("dhawan");
	    n.push("sachin");
	    n.push("pandya");
	    n.push("iyar");
	    n.push("gaikwad");
	    System.out.println(n);
	    System.out.println(n.peek());
	    n.pop();
	    System.out.println(n);
	    n.pop();
	    System.out.println(n);
	    n.pop();
	    System.out.println(n);
	    n.pop();
	    System.out.println(n);
	    n.pop();
	    System.out.println(n);
	    n.pop();
	    System.out.println(n);
	    n.pop();
	    System.out.println(n);
	    n.pop();
	    System.out.println(n);
	    n.push("surya");
	    System.out.println(n);
	    n.pop();
	    System.out.println(n);
	}
}
