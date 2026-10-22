package sidharthsircorejava;

import java.util.LinkedHashMap;
import java.util.Map.Entry;
import java.util.Set;

public class LinkedHashMapEx {

	public static void main(String[] args) {
		LinkedHashMap<Integer,String> prod=new LinkedHashMap<Integer,String>();
		prod.put(201,"laptop");
		prod.put(101,"mouse");
		prod.put(401,"keybord");
		prod.put(301,"nokiya 811");
		prod.put(701,"web ca9");
		prod.put(901,"sound bar");
		prod.put(701,"tv");
		prod.put(111,"alexa");
		//prod.put(null, null);
      
      prod.putFirst(12, "refrigerator");
      System.out.println(prod);
      System.out.println(prod.pollFirstEntry());
      System.out.println(prod);
      
     /* for(Integer i:prod.keySet()) {
    	  System.out.println(i+" "+prod.get(i));
      } */
    /*  for(String i:prod.values()) {
    	  System.out.println(i);
      } */
     // Set<Entry<Integer,String>>entryset=prod.entrySet();
    	for(var entry:prod.entrySet()) {
    		System.out.println(entry.getKey()+" "+entry.getValue());
      }
    	for(var entry:prod.entrySet()) {
    		if(entry.getKey()%2==0) {
    			System.out.print("even keys:"+entry.getKey());
    		}
      }
	}

}
