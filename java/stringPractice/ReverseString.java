
public class ReverseString {

    public static void main(String[] args) {
        String s = "Kiran";

        reverseStr(s);
        reverseWithTemp(s);
    }

    public static void reverseStr(String str){
        String rev ="";

        for(int i=str.length()-1; i>=0;i--){
            rev = rev + str.charAt(i);
        }
        System.out.println(rev);
    }

    public static void reverseWithTemp(String str){

        char temp;
        
        char[] ch = str.toCharArray();

        for(int i=0, j=str.length()-1; i<j ;i++, j--)
        {
                temp = ch[i];
                ch[i] = ch[j];
                ch[j] = temp;
        }

        System.out.println("Reverse with Array: "+new String(ch));

    }
    
}
