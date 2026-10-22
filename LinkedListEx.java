package sidharthsircorejava;
import java.util.LinkedList;
public class LinkedListEx {
	public static void main(String[] args) {
		LinkedList<Integer> num=new LinkedList<Integer>();
		num.add(50);
		num.add(10);
		num.add(20);
		num.add(20);
		num.add(30);
		num.add(40);
		num.add(null);
		num.add(null);
		System.out.println(num);
	
		num.addFirst(100);
		System.out.println(num);
		num.addLast(200);
		System.out.println(num);
		num.add(2,15);
		System.out.println(num);
		
		num.set(2, 30);
		
		num.remove(7);
		System.out.println(num);
		num.remove(num.get(3));
		System.out.println(num);
		//num.remove(10);
		Integer nums=num.get(2);
		System.out.println(nums);
		num.remove(nums);
		System.out.println(num);
		num.removeFirst();
		System.out.println(num);
		num.removeLast();
		System.out.println(num);	
     //Insertion order maintain
	//null value can allow
	}

}
