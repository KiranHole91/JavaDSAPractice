package javaPractice.arraysAndNumbers;

public class ArrayIsMountain {
    /** [1, 3, 5, 4, 2]
     * length should be > 2
     * Order should be increasing >> PEAK >> order shold be in decreasing ((No duplicates as well))
     */
    public static void main(String[] args) {
        int[] arr = {12, 20, 30, 50, 34, 23, 12, 9};
        System.out.println(isMountain(arr)); 
    }

    private static boolean isMountain(int[] arr) {
        if(arr.length < 3) 
            return false;

        // Validate increasing order
        int i=0;
            while((i+1)<arr.length && arr[i] < arr[i+1])
            {
                i++;
            }
        // Validate decreasing order
            while((i+1)<arr.length && arr[i] > arr[i+1] )
            {   
                 i++;
            }

        if(i == arr.length-1)
                return true;
            else
                return false;
        
    }
    
}
