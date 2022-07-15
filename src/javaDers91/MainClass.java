package javaDers91;

import java.util.HashMap;
import java.util.List;
import java.util.Map.Entry;
import java.util.TreeMap;

public class MainClass {
    public static void main(String[] args) {
        //HashMap liste = new HashMap();
        //TreeMap liste = new TreeMap();
        //HashMap<String, Integer> liste = new HashMap<>();
        TreeMap<String, Integer> liste = new TreeMap<>();
        liste.put("Hamza", 75);
        liste.put("Ali", 80);
        liste.put("Kadir", 100);


        System.out.println(liste);

        System.out.println(liste.containsKey("Kadir"));
        System.out.println(liste.containsValue(80));

        System.out.println("Entry Set : " + liste.entrySet());
        System.out.println("Key Set : " + liste.keySet());

        for (Entry<String,Integer> isim: liste.entrySet()) {
            System.out.println(isim);
            System.out.println(isim.getKey());
            System.out.println(isim.getValue());
            System.out.println();

        }
    }
}
