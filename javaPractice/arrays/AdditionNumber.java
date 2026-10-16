public class AdditionNumber {
    
    public static void main(String args[]){

    int num = 12345;
    int arr[] = {1,2,3,4,5};
    System.out.println("Addition of the Numbers :"+addNum(num) );
    System.out.println("Addition on Array :" +arrAdd(arr));
}

public static int addNum(int num){
    int sum = 0;

    while(num!=0){
        sum = sum + (num%10);
        num = num/10;
    }
return sum;

}

public static int arrAdd(int[] arr){

    int sum = 0;

    for(int i : arr)
    {
        sum = sum + i;
    }

    return sum;
}



}

