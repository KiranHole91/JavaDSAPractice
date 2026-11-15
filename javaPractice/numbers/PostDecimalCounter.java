package javaPractice.numbers;

public class PostDecimalCounter {
    /* Find the number of integer post decimal */
    public static void main(String[] args) {
        double a = 123.12345;

        //convert to String
        String aToString = String.valueOf(a);

        withSplit(aToString);
        withIndexing(aToString);

    }

    public static void withSplit (String str)
    {
        String stringArray[] = str.split("\\.");

        if(stringArray.length > 0)
        {
             int len = stringArray[1].length();
             System.out.println("with Split post decimal Digits : "+len );
        }
        else
            System.out.println("with Split post decimal Digits : 0");
    }

    public static void withIndexing(String str)
    {
       int index = str.indexOf('.');

        int len = str.length() - index -1 ;
        System.out.println("with Indexing post decimal Digits : " +len);
    }
}
