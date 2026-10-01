public class VowelConsonentDigitCount {
    public static void main(String[] args) {
        String str = "Hey there I'm Kiran ID 1123";

        vowelConsonentDigitCount(str);
    }

     public static void vowelConsonentDigitCount(String s){

        int vowels=0, consonents =0, digits =0, special =0;

        for(char ch : s.toLowerCase().toCharArray())
        {
            if("aeiou".contains(s.valueOf(ch))) vowels++;
            else if (ch>'a' && ch<'z') consonents++;
            else if (Character.isDigit(ch)) digits++;
            else special++;

        }
         System.out.println("vowels: "+vowels+" Consonents: "+consonents+ " Digits: "+digits+ " spl chars: "+special);
     }
}
