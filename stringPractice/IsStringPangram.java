package javaPractice.stringPractice;

import java.util.HashSet;

public class IsStringPangram {
    /*
    * Pangram mean all 26 alphabets are covered in a string
    */
    
    public static void main(String[] args) {
        String input = "The quick brown fox jumps over the lazy dog.";
        char[] charArray = input.toLowerCase().toCharArray();

        HashSet<Character> set = new HashSet<>();

        //Edge case
        if(input.length() < 26)
            System.out.println("Not a Pangram");

        for(char ch:charArray)
        {
            if(Character.isLetter(ch))
                set.add(ch);
        }
        if(set.size()==26) 
        {
            System.out.println("String is a Pangram");
        }
        else
            System.out.println("Not a Pangram");
        
    }
}
