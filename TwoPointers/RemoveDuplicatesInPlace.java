package TwoPointers;

import java.util.Arrays;

public class RemoveDuplicatesInPlace {
    /*
     * Problem: Remove Duplicates In Place
     *
     * Given an integer array, remove the duplicates in place so that each
     * Example:
     *   Input : {10, 5, 6, 10, 5, 12, 4}
     *   Output: 5  ->  [4, 5, 6, 10, 12]
     */
    public static void main(String[] args) {
        int[] arr = {10, 5, 6, 10, 5, 12, 4};

        Arrays.sort(arr);   // duplicates must be next to each other

        int slow = 0;

        for(int fast = 1; fast < arr.length; fast++)
        {
            if(arr[fast] != arr[slow])
            {
                slow++;
                arr[slow] = arr[fast];
            }
        }
        System.out.println(slow+1);
        System.out.println(Arrays.toString(Arrays.copyOf(arr, slow+1)));
    }
}
