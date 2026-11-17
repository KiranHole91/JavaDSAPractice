package SearchSortGraphs;

import java.util.Arrays;

public class BubbleSort {

    // Time complexity o(n)2
    public static void main(String[] args) {
        
        int arr[] = {5, 20, 15, 3, 10};
        int len = arr.length;

        for(int i=0; i <= len-1; i++)
        {
            for(int j=0; j < (len-1) - i; j++)
            {
                if (arr[j] > arr[j+1])
                {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
            System.err.println("Pass "+i+" "+Arrays.toString(arr));
        }
       
    }
}
