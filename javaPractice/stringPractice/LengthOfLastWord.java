package javaPractice.stringPractice;

public class LengthOfLastWord {
    public static void main(String[] args) {
        String str = "    Hello   My Name is  kIRAN    ";

        usingSplit(str);
        usingBackwordLoop(str);
        
    }

    public static void usingSplit(String str)
    {
        String[] strArray = str.trim().split(" ");
        System.out.println("Using Split :" +strArray[strArray.length-1].length());
    }

    public static void usingBackwordLoop(String str)
    {
        int count=0;
        char[] charArray = str.trim().toCharArray();

        for(int i= charArray.length-1; i>=0; i--)
        {
            if(charArray[i]!= ' ' ){
                count++;
            }
            else if (count>0)
            {
                System.out.println("Using Loop for toCharArray: "+count);
                break;
            }
         }
    }

}
