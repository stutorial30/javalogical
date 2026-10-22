package sidharthsircorejava;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

public class Ex4 {

	public static void main(String[] args) {
		HashMap<Integer,String> map=new HashMap<Integer,String>();
        map.put(9, "september");
        map.put(11, "novembar");
        map.put(2, "feb");
        map.put(3, "march");
        map.put(8, "august");
        map.put(5, "may");
        map.put(4, "april");
        map.put(7, "july");
        map.put(22, "january");
        map.put(6, "june");
        map.put(12, "december");
        System.out.println(map);
     /*   TreeMap<Integer, String> sortedMap = new TreeMap<>(map);
        System.out.println("------sortedMap-------");
        System.out.println(sortedMap);*/
        ArrayList<Integer> list=new ArrayList<Integer>(map.keySet());
        Collections.sort(list);
        for(Integer key:list) {
        	System.out.println(key+" "+map.get(key));
        }
	}

}
