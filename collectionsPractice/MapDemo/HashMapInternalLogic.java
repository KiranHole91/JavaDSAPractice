package MapDemo;

import java.util.HashMap;
import java.util.Map;

public class HashMapInternalLogic {
    //Print each key's hash and bucket index, show a collision, and see null key behaviour.

    static int bucket(Object key, int capacity) {
        int h = key.hashCode();
        h = h ^ (h >>> 16);                  // what HashMap does to spread bits
        return h & (capacity - 1);           // capacity is a power of 2, default 16
    }

    public static void main(String[] args) {
        String[] keys = {"Aa", "BB", "login", "logout"};

        for (String k : keys) {
            System.out.println(k + " hash=" + k.hashCode() + " bucket=" + bucket(k, 16));
        }
        
        System.out.println("\"Aa\" and \"BB\" have the same hashCode, so they collide and share a bucket.");

        Map<String, Integer> map = new HashMap<>();
        map.put(null, 1);                    // HashMap allows one null key
        map.put(null, 2);
        System.out.println("null key value: " + map.get(null) + ", size " + map.size());
        System.out.println("Default capacity 16, load factor 0.75, so it resizes after 12 entries.");
    }
}
