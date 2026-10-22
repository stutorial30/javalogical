package sidharthsircorejava;
import java.util.Collections;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.List;
public class LinkedListEx2 {

	public static void main(String[] args) {
		LinkedList<String> str=new LinkedList<String>();
		str.add("pune");
		str.add("mumbai");
		str.add("nashik");
		str.add("latur");
		str.add("beed");
		str.add("solapur");
         for(String city:str) {
              System.out.println(city);
         }
       ListIterator<String> it=str.listIterator();
       while(it.hasNext()) {
    	   String city=it.next();
    	   if(city.equals("nashik")){
    		   it.remove();
    	   }
       }System.out.println(str);
       Collections.sort(str,Collections.reverseOrder());
       System.out.println(str);
       Collections.swap(str, 0,4);
       System.out.println(str);
       Collections.shuffle(str);
       System.out.println(str);
	}

}
