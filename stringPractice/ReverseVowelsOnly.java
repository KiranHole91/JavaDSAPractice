package javaPractice.stringPractice;

public class ReverseVowelsOnly {
    public static void main(String[] args) {
        String input = "Hello";
        System.out.println("input : "+input);

        String vowels = "aeiouAEIOU";
        char[] charsArray = input.toCharArray();
        int left=0, right=input.length()-1;

        while(left < right)
        {
            if(vowels.indexOf(charsArray[left])==-1)
            {
                left++;
            }
            else if(vowels.indexOf(charsArray[right])==-1)
            {
                right--;
            }
            else 
            {
                char temp = charsArray[left];
                charsArray[left] = charsArray[right];
                charsArray[right] = temp;
                left++;
                right--;
            } 
        }

        System.out.println("Vowels only reverse: "+new String(charsArray));


    }
}
