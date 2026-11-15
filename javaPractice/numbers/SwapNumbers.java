package javaPractice.numbers;

public class SwapNumbers {
    public static void main(String[] args) {
    int a = 10;
    int b = 20;
    System.out.println("Inputs are >> a = "+a+" & b = "+b);

    withTemp(a, b);
    withoutThirdVariable(a, b);
    withoutArithmeticOperation(a, b);
    }

    public static  void withTemp(int a, int b)
    {
        int temp;
        temp = a;
        a = b;
        b =  temp;

        System.out.println("withTemp >> a = "+a+" & b = "+b);
    }

    // Use arithmetic operation
     public static void withoutThirdVariable(int a, int b)
    {
        a = a+b;
        b = a-b;
        a = a-b;

        System.out.println("without Third Variable : with Addition >> a = "+a+" & b = "+b);
    }

    //use Binary format convertion & EXOR operation
    public static void withoutArithmeticOperation (int a, int b)
    {
        a = a ^ b;
        b = a ^ b;
        a = a ^ b;
        
        System.out.println("without Third Variable : with EXOR >> a = "+a+" & b = "+b);
    }


}
