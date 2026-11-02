package Patterns;

import java.util.ArrayList;
import java.util.List;

public class PascalTriangle {

    // Way 1 : factorial formula nCr = n! / (r! * (n-r)!)
    static void usingFactorial(int rows)
    {
        for(int i=0; i<rows; i++)
        {
            for(int j=0; j<=i; j++)
            {
                System.out.print(factorial(i) / (factorial(j) * factorial(i-j)) + " ");
            }
            System.out.println();
        }
    }

    static long factorial(int n)
    {
        long result = 1;
        for(int i=2; i<=n; i++)
        {
            result = result * i;
        }
        return result;
    }


    public static void main(String[] args) {
        int rows = 5;

        System.out.println("Way 1 : Factorial formula");
        usingFactorial(rows);

    }
}
