package sidharthsircorejava;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;

public class HashMapEx2 {

    public static void main(String[] args) {

        HashMap<String, Integer> ts = new HashMap<>();

        ts.put("Hunter 350", 250000);
        ts.put("ZX10-R", 2500000);
        ts.put("Interceptor 650", 600000);
        ts.put("GT 650", 450000);
        ts.put("M1000RR", 5000000);
        ts.put("Z900", 150000);
        ts.put("RX 100", 150000);
        ts.put("MT 15", 215000);
        ts.put("R15", 230000);
        ts.put("Splendor", 96000);

        System.out.println(ts);

        // 1st approach: Display keys
        for (String t : ts.keySet()) {
            System.out.println(t);
        }

        // 2nd approach: Display values
        for (Integer t : ts.values()) {
            System.out.println(t);
        }

        // 3rd approach: Display keys and values
        Set<Entry<String, Integer>> entrySet = ts.entrySet();

        for (Entry<String, Integer> entry : entrySet) {
            System.out.println(
                entry.getKey() + " : " + entry.getValue()
            );
        }
    }
}
