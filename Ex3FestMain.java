package sidharthsircorejava;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

public class Ex3FestMain {

	public static void main(String[] args) {
		HashMap<Festivals,String> festivals=new HashMap<Festivals,String>();
        festivals.put(new Festivals(2,"diwali","chivda"),"november");
        festivals.put(new Festivals(3,"dusshera","puran poli"),"octobar");
        festivals.put(new Festivals(1,"navratri","shabudana"),"octobar");
        festivals.put(new Festivals(4,"ganpati","ukdicha modak"),"september");
        festivals.put(new Festivals(5,"magashivratri","sweet potato"),"februray");
        System.out.println(festivals);
        ArrayList<Festivals> list =new ArrayList<>(festivals.keySet());
        Collections.sort(list);
        for (Festivals fest : list) {
            System.out.println(fest + " " + festivals.get(fest));
        } 
	}

}
