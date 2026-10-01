public class PalindromeCheck {

    public static void main(String args[]){

        int num = 1234321;

        isPalindrom(num);
    }

    public static void isPalindrom(int num){
        int org = num;
        int rev = 0;
        while(num!=0){
            rev = (rev*10) + (num%10);
            num = num/10;
        }
        if (rev==org) System.out.println(org +" Number is Palindrom");
        else 
            System.out.println(org +" Number is NOT Palindrom");
    }


}
