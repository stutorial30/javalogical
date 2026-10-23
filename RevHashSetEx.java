package sidharthsircorejava;

import java.util.Collections;
import java.util.HashSet;
import java.util.TreeSet;

public class RevHashSetEx {

	public static void main(String[] args) {
		HashSet<Integer> h=new HashSet<>();
		h.add(10);
		h.add(20);
		h.add(30);
		h.add(40);
		TreeSet<Integer> t=new TreeSet<>(Collections.reverseOrder());
        t.addAll(h);
		System.out.println(t);
	}

}
