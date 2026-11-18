package SearchSortGraphs;

public class BinarySearch {
    //time complexity >> Best >> O (n Log n) & stable in worst condition
    // Search with  Middle of index
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 75, 100, 60};
        int searchNumber = 75;

        System.out.println("Found at Index: "+ binarySearch(arr, searchNumber));
    }

    private static int binarySearch(int[] arr, int searchNumber) {
        int left = 0;
        int right = arr.length - 1;
        while (left <= right)
        {
             int midIndex = (left + right)/2;
             if (arr[midIndex] == searchNumber)
                 return midIndex;

              if(searchNumber < arr[midIndex])
                    right = midIndex - 1;
                else
                    left = midIndex + 1;

        }
        return -1;
    }
}
