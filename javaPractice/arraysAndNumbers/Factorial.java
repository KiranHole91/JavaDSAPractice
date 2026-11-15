package javaPractice.arraysAndNumbers;
import java.math.BigInteger;

class Factorial{

    public static void main(String[] args) {
        int no = 50;
        System.out.println(fact(no));
        System.out.println(recFact(no));
    }

    // using For Loop
    static BigInteger fact(int no)
    {   // int res = 1;
        BigInteger res = BigInteger.ONE;

        for(int i=1;i <= no; i++)
        {   // res = res * i;
            res = res.multiply(BigInteger.valueOf(i));
        }
        return res;
    }

    //using recursion
    static int recFact(int no)
    {
        //Base case
        if (no==1) return 1;
        else
            return no * recFact(no-1);
    }

}
