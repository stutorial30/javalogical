package sidharthsircorejava;

import java.util.TreeMap;

public class TreeMapEx {

	public static void main(String[] args) {
		TreeMap<Integer,String> t=new TreeMap<Integer,String>();
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
       System.out.println(t);
       System.out.println(t.firstKey());
       System.out.println(t.lastKey());
       System.out.println(t.firstEntry());
       System.out.println(t.lastEntry());
       System.out.println(t.pollFirstEntry());
       System.out.println(t);
       System.out.println(t.pollLastEntry());
       System.out.println(t);
       System.out.println(t.remove(90)+"khalla");
       System.out.println(t);
       System.out.println(t.remove(7,"Gulam Jamun")+"khalla");
       System.out.println(t);
       
	}

}
