package collectionsPractice.MapDemo;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class HashMapCharCount {

    //Count each character in "automation", ignoring case and spaces, and find the most frequent.
    public static void main(String[] args) {       
        String str = "automationTest";
        HashMap<Character, Integer> map = new HashMap<>();
        
        for(char ch : str.toLowerCase().toCharArray())
        {
            map.put(ch, map.getOrDefault(ch,0)+1);
        }

        //Print the Key - Values
        for(char ch: map.keySet())
        {
            System.out.println(ch+ " : "+map.get(ch));
        }

        // Find & print Most frequent

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
