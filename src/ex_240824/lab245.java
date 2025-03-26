package ex_240824;

import java.util.HashMap;
import java.util.Map;

public class lab245 {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap();
        map.put("id1", 1);
        map.put("id2", 2);
        map.put("id3", 3);
        map.put("idNull", null);
        map.put("id4", 4);
        map.put("id5", 5);
        map.put("id6", 6);
        map.put("id6", 6);
        map.put("id7", null);
        map.put("id8", null);
        map.put(null, 909);
        map.put(null, 999);
//        map.put("id7", "Vaibhav");

//        System.out.println(map);
//        System.out.println(map.size());
//        System.out.println(map.isEmpty());
//        System.out.println(map.get("id3"));
//        System.out.println(map.containsKey("id2"));
//        System.out.println(map.containsValue(99));
//        System.out.println(map.keySet());
//        System.out.println(map.values());

        // How to iterate over all the elements in the map
        for(Map.Entry<String,Integer> item: map.entrySet()){
            System.out.println(item.getKey() + " " +  item.getValue());
        }

    }
}

