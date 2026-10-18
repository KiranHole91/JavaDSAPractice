package collectionsPractice;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class HashMapCharCount {

    //Count each character in "automation", ignoring case and spaces, and find the most frequent.
    public static void main(String[] args) {       
        String str = "automation testing";
        HashMap<Character, Integer> map = new HashMap<>();

        for(char ch : str.toLowerCase().toCharArray())
        {
            map.put(ch, map.getOrDefault(ch,0)+1);
        }
        System.out.println(new TreeMap<>(map));  

        int max = 0;
        char top=' ';
        for(Map.Entry<Character, Integer> e : map.entrySet())
        {
             if (e.getValue() > max) 
                { 
                    max = e.getValue(); 
                    top = e.getKey(); 
                }
        }

        System.out.println("Most frequent: " + top + " (" + max + ")");

    }
}
