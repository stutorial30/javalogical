package sidharthsircorejava;

import java.util.*;
public class DequeueEx {

	public static void main(String[] args) {
		Deque<Integer>n=new LinkedList<Integer>();
		n.add(10);
		n.add(40);
		n.add(60);
		n.addFirst(20);
		n.addLast(30);
		System.out.println(n);
		System.out.println(n.getFirst());
		System.out.println(n.getLast());
		System.out.println(n.peekFirst());
		System.out.println(n.peekLast());
		/*n.removeFirst();
		System.out.println(n);
		n.removeLast();
		System.out.println(n);
		n.pollFirst();
		System.out.println(n);
		n.pollLast();
		System.out.println(n);
		n.remove();
		System.out.println(n);
		n.clear();
		System.out.println(n);
		System.out.println(n.poll());*/
		n.offerFirst(70);
		System.out.println(n);
		n.offerLast(50);
		System.out.println(n);
		//sort deque
		ArrayList<Integer> l=new ArrayList<Integer>(n);
		Collections.sort(l);
		System.out.println(l);
	}

}
