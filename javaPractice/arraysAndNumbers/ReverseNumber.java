import java.util.Arrays;

class ReverseNumber {

public static void main(String args[]){

    int num = 657512345;
    System.out.println("reverse NO :"+revNum(num) );

      int arr[] ={1,2,3,4,5};
      revArr(arr);
}

public static int revNum(int num){
    int reverse = 0;
    int lastDigit;
    while(num!=0){
        lastDigit = num % 10;
        if (reverse>Integer.MAX_VALUE/10)   //Edge case for overflow 
        {
            System.out.println(0);
            System.exit(0);
        }
        reverse = (reverse*10) + lastDigit;
        num = num/10;
    }
return reverse;
}

public static void revArr(int[] arr){
    int i=0, j= arr.length-1, temp=0;

    while(i<j){
        temp= arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
        i++;
        j--;
    }

    System.out.println("Reverse Array : "+Arrays.toString(arr));
}




}