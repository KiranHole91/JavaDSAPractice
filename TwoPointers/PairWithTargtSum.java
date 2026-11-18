package TwoPointers;

import java.util.Arrays;

public class PairWithTargtSum {
    public static void main(String[] args) {
        int arr[]= {0,3,4,5,2,4,3,6};
        int target = 8;

        int i=0, j= arr.length-1;

        Arrays.sort(arr); //sort array first

        for( ; i<j ;i++)
        {
            if(arr[i]+ arr[j] == target)
            {
                System.out.println(arr[i]+" "+arr[j]);
            }
            else if(arr[i]+ arr[j] > target)    j--;
            else if(arr[i]+ arr[j] < target)    i++;

        }
      


    }
}
