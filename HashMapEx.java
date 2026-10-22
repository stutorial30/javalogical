package sidharthsircorejava;

import java.util.HashMap;

public class HashMapEx {

	public static void main(String[] args) {
		HashMap<Integer,String>hm=new HashMap<Integer,String>();
		hm.put(2,"parbhani");
		hm.put(1,"pune");
		hm.put(4,"patna");
		hm.put(3,"palghar");
		hm.put(7,"pandharpur");
		hm.put(8,"panvel");
		hm.put(11,"pusad");
		hm.put(null,"parbhani");
		//hm.put(null,"pcmc");
        System.out.println(hm);
        String value=hm.get(1);
        System.out.println(value);
        String value2=hm.getOrDefault(10,"key is not present");
        System.out.println(value2);
        hm.remove(11);
        System.out.println(hm);
       boolean remove=hm.remove(3,"palghar");
        System.out.println(hm);
        System.out.println(hm.containsKey(1));
        System.out.println(hm.containsValue("panvel"));
        hm.putIfAbsent(10, "mumbai");
        System.out.println(hm);
        hm.replace(null,"jaipur");
        System.out.println(hm);
        boolean replace=hm.replace(null, "jaipur","banglore");
        System.out.println(replace);
        
	}
}
