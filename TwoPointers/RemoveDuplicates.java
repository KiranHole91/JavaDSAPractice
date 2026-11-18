package TwoPointers;

import java.util.Arrays;

public class RemoveDuplicates {
    /*
     * Problem: Remove Duplicates (keep original order)
     */
    public static void main(String[] args) {
        int[] arr = {10, 5, 6, 10, 5, 12, 4};

        int slow = 0;   // arr[0..slow-1] holds the unique numbers

        for(int fast = 0; fast < arr.length; fast++)
        {
            boolean seen = false;
            for(int k = 0; k < slow; k++)
            {
                if(arr[k] == arr[fast])
                {
                    seen = true;
                    break;
                }
            }

            if(!seen)
            {
                arr[slow] = arr[fast];
                slow++;
            }
        }
        System.out.println(slow);
        System.out.println(Arrays.toString(Arrays.copyOf(arr, slow)));
    }
}
