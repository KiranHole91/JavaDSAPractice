
public class StringPalindrome {

    public static void main(String[] args) {
        String s = "KIRIK";

      if( isPalindrome(s)==true) System.out.println(s+" is Palindrome");
      else System.out.println(s+" is NOT Palindrome");
    }

    public static boolean isPalindrome(String str){

        int left=0 , right = str.length()-1;

        while(left<right)
        {
            if(str.charAt(right)!=str.charAt(left)) return false;
            left++;
            right--;
        }

        return true;
    }
    
}