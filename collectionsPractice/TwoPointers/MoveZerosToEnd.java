package collectionsPractice.TwoPointers;

import java.util.Arrays;

public class MoveZerosToEnd {
    public static void main(String[] args) {

        int arr[] = {0,5,3,0,0,4,7};
        int putNonZeroIndex=0, temp=0;

        for(int current=0 ; current<arr.length ; current++)
        {
            if(arr[current] != 0)
            {
                temp = arr[current];
                arr[current] = arr[putNonZeroIndex];
                arr[putNonZeroIndex] = temp;
                putNonZeroIndex++;
            }
        }

        System.out.println(Arrays.toString(arr));

        for(int i : arr)
        {
            System.out.print(i);
        }
    }
}
