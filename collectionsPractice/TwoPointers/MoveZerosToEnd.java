package TwoPointers;

import java.util.Arrays;

public class MoveZerosToEnd {
    public static void main(String[] args) {

        int arr[] = {0,5,3,0,0,4,7};
        int j=0, temp=0;

        for(int i=0 ; i<arr.length ; i++)
        {
            if(arr[i] != 0)
            {
                temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                j++;
            }
        }

        System.out.println(Arrays.toString(arr));
    }
}
