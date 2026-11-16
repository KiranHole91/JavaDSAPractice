package javaPractice.stringPractice;

public class ReplaceVowels {
    // Replace all the vowels in string with X
    public static void main(String[] args) {
        String input = "Name";

        String vowels = "aeiou";
        char[] charArray =  input.toLowerCase().toCharArray();
        StringBuilder sb =  new StringBuilder(input);

        for(int ch=0; ch<= charArray.length-1; ch++)
        {
            if(vowels.indexOf(input.charAt(ch))>=0)
               input = input.replace(input.charAt(ch),'X');
        }

        System.out.println(input);
    }
}
