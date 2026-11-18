package SearchSortGraphs;

import java.util.Arrays;

public class MergeSort {
    // O(n log n)
    // Divide & conquer to get merged & Sorted Array
    public static void main(String[] args) {
        int arr[] = {30, 40, 20, 10, 100, 50};
        divide(arr,0, arr.length-1);
        System.out.println(Arrays.toString(arr));
    }

    private static void divide(int[] arr, int left, int right) {
        
           if(left >= right) return ;

        int middleIndex = (left + right) / 2;
        
        divide(arr, left, middleIndex);
        divide(arr, middleIndex+1, right);

        conquer(arr, left, middleIndex, right);
    }

    private static void conquer(int[] arr, int left, int middleIndex, int right) {
        int mergedArray[] = new int[right - left +1]; // create merged array of same array length
        int index1 = left,
            index2 = middleIndex + 1,
            x = 0;

        //Sort & merge the 2 arrays in mergedArray[]     
        while (index1 <= middleIndex && index2 <= right) {
            if (arr[index1] <= arr[index2]) 
                mergedArray[x++] = arr[index1++];
            else                           
                 mergedArray[x++] = arr[index2++];
        }
        //Print pending extra elements from  divided arrays
        while (index1 <= middleIndex) mergedArray[x++] = arr[index1++];
        while (index2 <= right)       mergedArray[x++] = arr[index2++];

        for (int i = 0, j = left; i < mergedArray.length; i++, j++) 
            arr[j] = mergedArray[i];
    }
        
    
}
