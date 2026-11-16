package javaPractice.arraysAndNumbers;

public class LargestSecondLargest {

    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 50, 50}; 

        int largest = Integer.MIN_VALUE;
        int secLargest = 0;

        for(int i : arr)
        {
            if (i>largest)
            {
                secLargest = largest;
                largest = i;     
            }
            if(i>secLargest && i != largest) 
                secLargest = i;
        }

        System.out.println("Largest: "+largest);
        System.out.println("Second Largest : "+secLargest);
    }
    
}
