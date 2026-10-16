public class LargestSecondLargest {

    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 50, 50}; 

        int fir =0, sec =0;

        for(int i : arr)
        {
            if (i>fir)
            {
                sec = fir;
                fir = i;
                
            }
            if(i>sec && i != fir) sec = i;
        }

        System.out.println("Largest: "+fir);
        System.out.println("Second Largest : "+sec);
    }
    
}
