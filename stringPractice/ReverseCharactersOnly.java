package javaPractice.stringPractice;

public class ReverseCharactersOnly {
    public static void main(String[] args) {
        
        String input = "12Kir5an24";
        char[] charsArr = input.trim().toCharArray();
        int left = 0, right = charsArr.length-1;

        while(left < right)
        {
            if( ! Character.isLetter(charsArr[left]))
            {
                left++;
            }
            else if ( ! Character.isLetter(charsArr[right]))
            {
                right--;
            }
            else
            {
                char temp = charsArr[left];
                charsArr[left] = charsArr[right];
                charsArr[right] = temp;
                left++;
                right--;
            }
        }
        System.out.println(charsArr);

        
    }
}
