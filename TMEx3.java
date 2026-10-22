package sidharthsircorejava;

import java.util.Collections;
import java.util.TreeMap;

public class TMEx3 {

	public static void main(String[] args) {
		TreeMap<Integer,String> t=new TreeMap<Integer,String>(/*Collections.reverseOrder()*/);
		      t.put(1,"Pani Puri");
			  t.put(30,"Mutton Biryani");
			  t.put(10,"Chicken Shawrma");
			  t.put(20,"Veg Thali");
			  t.put(60,"Mutton Ran");
			  t.put(50,"Mysoore Cheese Dosa");
			  t.put(40,"French Fries");
			  t.put(90,"Fried Rice");
		   	  t.put(100,"Momos");
	          t.put(7,"Gulab Jamun");
			  t.put(2,null);
			   /*System.out.println(t.headMap(50));
			   System.out.println(t.headMap(50, true));
		       System.out.println(t.tailMap(50));
		       System.out.println(t.tailMap(50, true));*/
	   	    System.out.println(t);
	   	    System.out.println(t.descendingMap());
	   	    
			      

	}

}
