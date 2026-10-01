import java.util.Arrays;

class ReverseNumber {

public static void main(String args[]){

    int num = 12345;
    System.out.println("reverse NO :"+revNum(num) );

      int arr[] ={1,2,3,4,5};
      revArr(arr);
}

public static int revNum(int num){
    int reverse = 0;

    while(num!=0){
        reverse = (reverse*10) + (num%10);
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