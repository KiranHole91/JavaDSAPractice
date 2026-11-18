package TwoPointers;

import java.util.Arrays;

public class SquareSortedArray {
    /*
     * Problem: Given a sorted array (may have negatives), return the squares of each number in sorted order
     */
    public static void main(String[] args) {
        int[] arr = {-7, -3, 0, 2, 5};
        int[] result = new int[arr.length];

        int left = 0, right = arr.length - 1;
        int pos = arr.length - 1;   // fill result from the end (biggest square first)

        while(left <= right)
        {
            int leftSq = arr[left] * arr[left];
            int rightSq = arr[right] * arr[right];

            if(leftSq > rightSq)
            {
                result[pos] = leftSq;
                left++;
            }
            else
            {
                result[pos] = rightSq;
                right--;
            }
            pos--;
        }

        System.out.println(Arrays.toString(result));
    }
}
