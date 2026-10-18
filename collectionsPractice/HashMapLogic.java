package collectionsPractice;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class HashMapLogic {
    
    public static void main(String[] args) {

        Map<String, Integer> hm = new HashMap<>();
        hm.put("Kiran", 110);
        hm.put("Jyoti", 10);
        hm.put("Dhruv", 14);

        System.out.println("With lambda Function :");
         hm.forEach((key, value) -> {
            System.out.println("Key: " +key+ " Value: "+value);
         });

         hm.replace("Jyoti",20);
         hm.put("Daksh", 02);

          System.out.println("With For loop :");
        for(Map.Entry<String, Integer> entry : hm.entrySet())
        {
            System.out.println("Key: "+entry.getKey()+" Value: "+entry.getValue());
        }

        
    }
}
