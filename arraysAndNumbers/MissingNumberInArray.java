package javaPractice.arraysAndNumbers;

public class MissingNumberInArray {
    /*
    Number limit range > 1 to 6
    Numbers are unique with no duplicates
     */
    public static void main(String[] args) {
        
        int arr[] = {1,2,4,5,6};

        usingSumOfNumbers(arr);
        usingFormula(arr);
        usingXOR(arr);

    }
    public static void usingFormula(int[] arr)
    {
        int totalNumbers = 6, actualSum=0;
       int totalSumOfNumbers = (totalNumbers 
        * (totalNumbers+1) / 2);
       for(int i:arr)
        {
            actualSum = actualSum + i;
        }

         System.out.println("Missing Number with formula is : "+ (totalSumOfNumbers - actualSum) );

    }

     public static void usingXOR(int[] arr)
    {
        int missingNumber = 0;
        for(int no: arr)
        {
            missingNumber = missingNumber ^ no;
        }

        for(int i=0; i<=6; i++)
        {
            missingNumber = missingNumber ^ i;
        }

        System.out.println("Missing Number with XOR : "+missingNumber );
    }

    public static void usingSumOfNumbers(int[] arr)
    {
        int expectedSum = 0, actualSum=0, missingNum;
        for(int i=0; i<=6; i++)
        {
            expectedSum = expectedSum + i;
        }

        for(int i:arr)
        {
            actualSum = actualSum + i;
        }
   
        missingNum = expectedSum - actualSum;
        System.out.println("Missing Number is : "+missingNum );
    }
}
