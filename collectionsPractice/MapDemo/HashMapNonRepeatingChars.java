package MapDemo;

import java.util.HashMap;
import java.util.Map;

public class HashMapNonRepeatingChars {
    //Find the first character that appears only once in "swiss".
    public static void main(String[] args) {
        String str = "swiss";

        HashMap<Character, Integer> map = new HashMap<>();

        for(char ch : str.toCharArray())
        {
            map.put(ch, map.getOrDefault(ch, 0)+1);
        }

        for(Map.Entry<Character, Integer> e:map.entrySet())
        {
            if(e.getValue() == 1) 
            {
                System.out.println("First Non-Repeating Char : " + e.getKey());
                break;
            }
        }
    }   
}
