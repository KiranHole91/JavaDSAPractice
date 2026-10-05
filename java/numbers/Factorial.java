class Factorial{

    public static void main(String[] args) {
        int no = 5;
        System.out.println(fact(no));
        System.out.println(recFact(no));
    }

    static int fact(int no)
    {   int res = 1;

        for(int i=1;i <= no; i++)
        {
            res = res * i;
        }
        return res;
    }

    static int recFact(int no)
    {
        //Base case
        if (no==1) return 1;
        else
            return no * recFact(no-1);
    }

}
