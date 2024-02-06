package DSA.hashing;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

//unordered map - O(1)
public class hashmap {
    public static void main(String[] args) {
//        country(key), population(value)
        HashMap<String, Integer>  map = new HashMap<>();

//        insert
        map.put("India", 120);
        map.put("USA", 30);
        map.put("China", 150);

        map.put("USA", 50);

        System.out.println(map);

//        search/loop up
        if(map.containsKey("Indonesia")){
            System.out.println("Present");
        }
        else{
            System.out.println("No present");
        }

//        get value
//        if key does not exist it will print null
        System.out.println(map.get("China"));
        System.out.println(map.get("Indonesia"));

//        map set / interation
        for(Map.Entry<String, Integer> e:map.entrySet()){
            System.out.println(e.getKey());
            System.out.println(e.getValue());
        }

//        get keys
        Set<String> keys = map.keySet();
        for(String key : keys){
            System.out.println(key + " " + map.get(key));
        }

//        remove
        map.remove("China");
        System.out.println(map);
    }
}
