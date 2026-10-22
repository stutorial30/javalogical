package sidharthsircorejava;

import java.util.LinkedHashMap;

public class LHMapEx2 {

	public static void main(String[] args) {
		LinkedHashMap<Integer,String> prod=new LinkedHashMap<Integer,String>(32,0.75f,true);
		prod.put(201,"laptop");
		prod.put(101,"mouse");
		prod.put(401,"keybord");
		prod.put(301,"nokiya 811");
		prod.put(701,"web ca9");
		prod.put(901,"sound bar");
		prod.put(701,"tv");
		prod.put(111,"alexa");
		prod.put(null, null);
        prod.get(201);
        System.out.println("========after accessing element=========");
        System.out.println(prod);
	}

}
