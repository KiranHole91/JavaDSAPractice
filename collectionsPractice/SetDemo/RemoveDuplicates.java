package collectionsPractice.SetDemo;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class RemoveDuplicates {
    public static void main(String[] args) {
        String input = "abcdcbdabdf";

        char[]  inputArray =  input.toCharArray();
        LinkedHashSet<Character> hs = new LinkedHashSet<>();

        for(char ch : inputArray)
        {   
            hs.add(ch);         
        }

        System.out.println(hs);

        System.out.println("With Iterator :");
        Iterator<Character> itr = hs.iterator();
        while(itr.hasNext())
        {
            System.out.print(itr.next());
        }
    }
}
