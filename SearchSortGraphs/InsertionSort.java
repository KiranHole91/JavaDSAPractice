package SearchSortGraphs;

import java.util.Arrays;

public class InsertionSort {

    // Time complexity o(n)2
public static void main(String[] args) {
    
    int arr[] = { 10, 50, 60, 20, 30};
    int len = arr.length;

    for(int i=1; i <= len-1; i++)
    {
        // Take a current Element first
        int current = arr[i];
        int j = i-1;
        //traverse till start of array & while current >> Left value is greater
        while((j >= 0) && (arr[j] > current))
            {
                arr[j+1] = arr[j];
                j--;
            }
        arr[j+1] = current;
        System.out.println(i+" pass "+Arrays.toString(arr));
    }
 
    

}

    
}
