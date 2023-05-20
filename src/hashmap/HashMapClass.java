package hashmap;
import java.util.*;

public class HashMapClass {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();

        //insertion
        map.put("India", 120);
        map.put("US", 30);
        map.put("China", 150);
        System.out.println(map);

        map.put("China", 180);
        System.out.println(map);

        if(map.containsKey("England")){
            System.out.println("present");
        }else {
            System.out.println("Not present");
        }

        System.out.println(map.get("India"));
        System.out.println(map.get("England"));

        for (Map.Entry<String, Integer> e : map.entrySet()){
            System.out.println(e.getKey());
            System.out.println(e.getValue());
        }

        Set<String> keys = map.keySet();
        for (String key: keys){
            System.out.println(key + " " + map.get(key));
        }

        map.remove("China");
        System.out.println(map);
    }
}
