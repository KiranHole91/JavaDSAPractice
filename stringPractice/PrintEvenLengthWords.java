package javaPractice.stringPractice;

import java.util.Arrays;

public class PrintEvenLengthWords {
    //Print all words with even length
    public static void main(String[] args) {
        String input = "Sky is Blue cloudy and vast";
        System.out.println("Input : "+input);

        String[] words = input.split(" ");
        System.out.println("splitted : "+Arrays.toString(words));
        for(String word: words)
        {
            if(word.length()%2 == 0)
            {
                System.out.println(word+ " : "+word.length());
            }
        }
        
    }
}
