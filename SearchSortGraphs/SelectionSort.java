package SearchSortGraphs;

import java.util.Arrays;

public class SelectionSort {

    // Time complexity o(n)2
    public static void main(String[] args) {
        
        int[] arr = {10, 5, 7, 4 ,3};
        int len = arr.length;

        for(int i=0; i<=len-1; i++)
        {
            int min = i ; // otherwise 1st element not sorted

            for(int j=i+1; j<=len-1; j++)
            {
                if(arr[j] < arr[min])
                {
                    int temp = arr[j];
                    arr[j] = arr[min];
                    arr[min] = temp;
                }          
            }
            System.err.println("Pass "+i+" "+Arrays.toString(arr));
             
        }
       
    }
}
