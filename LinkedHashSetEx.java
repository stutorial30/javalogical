package sidharthsircorejava;

import java.util.LinkedHashSet;

public class LinkedHashSetEx {
/*linkedhashset doubly linked list+hashset data structure
 * linkedhashset duplicate not allow
 *linkedhashset  null allow
 *linkedhashset multiple null not allow
 *linkedhashset insertion order maintain
 * 
 */
	public static void main(String[] args) {
		LinkedHashSet<Integer> num=new LinkedHashSet<Integer>();
		num.add(20);
		num.add(10);
		num.add(30);
		num.add(45);
		num.add(35);
		num.add(35);
		System.out.println(num);
		num.addFirst(100);
		System.out.println(num);
		num.addLast(200);
		System.out.println(num);
		System.out.println(num.getFirst());
		System.out.println(num.getLast());
		num.removeFirst();
		System.out.println(num);
		num.removeLast();
		System.out.println(num);
	}

}
