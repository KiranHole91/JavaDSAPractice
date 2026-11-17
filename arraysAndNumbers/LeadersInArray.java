package javaPractice.arraysAndNumbers;

import java.util.Arrays;

public class LeadersInArray {
    /**
     * Number in array greater than all "Right" elements in array ++++ 
     *  Last element always LEADER so start with right
     */
    public static void main(String[] args) {
        int[] arr = {10, 17, 3, 5, 7, 3};

        int rightMax = arr[arr.length-1];
        System.out.println(rightMax);
        
        for(int index=arr.length-1; index>=0; index--)
        {
            if(arr[index]>rightMax)
            {
                rightMax = arr[index];   
                System.out.println(rightMax);
            }
        }
    }
}
