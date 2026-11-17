package javaPractice.stringPractice;

import java.util.Arrays;

public class isStringAnagram {
    // check if both string has same characters
    public static void main(String[] args) {
        String str1 = "Kiran";
        String str2 = "Niak";

        if(str1.length() != str2.length())
        {
            System.out.println("Not a Anagram");
            System.exit(0);
        }

        char[] charArray1 =  str1.toLowerCase().toCharArray();
        char[] charArray2 =  str2.toLowerCase().toCharArray();

        Arrays.sort(charArray1);
        Arrays.sort(charArray2);

        if(Arrays.equals(charArray1,charArray2))
            System.out.println("Both Strings are Anagram");
        else 
            System.out.println("Not a Anagram");

        
    }
}
