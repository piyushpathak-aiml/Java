import java.util.HashMap;

public class HashMaps {
    public static void main(String[] args) {

        // HashMap = A data structure that stores key-value pairs 
        // Keys are unique, but values can be duplicated
        // Does not maintain any order, but is memory efficient
        // HashMap<Key, Value>

        // object
        HashMap<String, Double> map = new HashMap<>();

        // putting things in hashmap
        map.put("apple", 0.50);
        map.put("orange", 0.75);
        map.put("banana", 0.25);

        System.out.println("******************************");
        System.out.println(map);
        System.out.println("******************************");

        // the keys have to be unique, while the values can be duplicated

        map.put("orange", 10000.00);
        System.out.println(map);
        System.out.println("******************************");

        // this overwrites the pervious value of orange

        // removing values from hashmap
        map.remove("orange");
        System.out.println(map);
        System.out.println("******************************");

        map.put("coconut", 1.00);

        System.out.println(map.get("apple"));
        System.out.println("******************************");

        // we can check for a key or value exists or not
        System.out.println(map.containsKey("banana"));
        System.out.println(map.containsKey("pineapple"));
        System.out.println("******************************");

        System.out.println(map.containsValue(1.25));
        System.out.println(map.containsValue(1.00));
        System.out.println("******************************");

        // lets use if-else with these
        if(map.containsKey("pineapple")) {
            System.out.println(map.get("apple"));
        }
        else {
            System.out.println("Key not found");
        }
        System.out.println("******************************");

        // we can get the size of the map
        System.out.println(map.size());
        System.out.println("******************************");

        // the System.out.println(map); gives ugly formatting, so we can use a for loop to print the map in our custom manner

        for (String key : map.keySet()) {
            System.out.println(key + " : $" + map.get(key));
        }
        System.out.println("******************************");

    }
}