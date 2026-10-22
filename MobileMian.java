package sidharthsircorejava;

import java.util.TreeMap;

public class MobileMian {

	public static void main(String[] args) {
		TreeMap<Mobiles,Integer> t=new TreeMap<Mobiles,Integer>(/*Collections.reverseOrder()*/);
        t.put(new Mobiles(2,"I Phone 18 pro","Apple"),165000);
        t.put(new Mobiles(3,"s25","samsung"),399000);
        t.put(new Mobiles(1,"I Phone due","Apple"),60000);
        t.put(new Mobiles(4,"tx 5 g","vivo"),32000);
        System.out.println(t);
	}

}
