package sidharthsircorejava;

import java.util.TreeMap;

public class TMEx {

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
     System.out.println(t.lowerKey(40));
     System.out.println(t.lowerEntry(40));
     System.out.println(t.higherKey(40));
     System.out.println(t.higherEntry(40));
     System.out.println(t.floorKey(39));
     System.out.println(t.floorEntry(39));
     System.out.println(t.ceilingKey(41));
     System.out.println(t.ceilingEntry(4));
     
	}

}
