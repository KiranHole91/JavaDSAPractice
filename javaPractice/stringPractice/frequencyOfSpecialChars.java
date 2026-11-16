package javaPractice.stringPractice;

import java.util.HashMap;
import java.util.Map;

public class frequencyOfSpecialChars {
    public static void main(String[] args) {
        String input = "kiran@#$hole@$";
        HashMap<Character, Integer> splChaFreqMap = new HashMap<>();

        char[] inputArray = input.toLowerCase().toCharArray();

        for(char ch :inputArray)
        {
            if ( ! ((ch>='a' && ch<='z') || (ch>='0' && ch<='9') || (ch== ' ')))
            {
                splChaFreqMap.put(ch, splChaFreqMap.getOrDefault(ch, 0)+1);
            }           
        }
        //Different ways of printing Map
         System.out.println(splChaFreqMap);
        for (Map.Entry<Character,Integer> e : splChaFreqMap.entrySet()) 
            {
                System.out.println(e.getKey()+" : "+e.getValue());
            }   

    }
}
