package sidharthsircorejava;

//import java.util.Collections;
import java.util.TreeSet;

public class TreeSetEx {
/*null not allow
 *TreeSet duplicates value not allow
 *multiple null not allowed
 * Data Structure selfbalancing tree/red-black tree
 * insertion order not maintained
 */
	public static void main(String[] args) {
		//TreeSet<Integer> ts=new TreeSet<Integer>(Collections.reverseOrder());
		TreeSet<Integer> ts=new TreeSet<Integer>();
		ts.add(30);
		ts.add(20);
		ts.add(99);
		ts.add(3);
		ts.add(2);
		ts.add(15);
		//ts.add(20);
		//ts.add(null);
		System.out.println(ts);
		System.out.println(ts.floor(20));
		System.out.println(ts.ceiling(20));
		System.out.println(ts.higher(20));
		System.out.println(ts.lower(99));
	}
}
