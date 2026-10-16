public class SumMinMaxAvg {
    public static void main(String[] args) {
        
        int[] arr = {10, 20, 30, 40};

        int sum=0, min=arr[0], max=arr[0], avg=0;

        for(int i : arr){
            sum = sum + i;
            if (i>max) max = i;
            if (i<min) min = i;
        }
        avg = sum/(arr.length);
        System.out.println("Sum : "+sum);
        System.out.println("Max : "+max);
        System.out.println("Min : "+min);
        System.out.println("Avg : "+avg);
    }
}
