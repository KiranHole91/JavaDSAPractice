package OOPS;

public class Loans extends BusinessCustomer {

    Loans(int cust_ID) {
        super(cust_ID);
        //TODO Auto-generated constructor stub
    }

    public static void main(String[] args) {
        Loans ln = new Loans(1123);
        ln.setlNBPALLimit(500000);
        ln.setCurrentLoanAmount(100000);
        System.out.println(ln.getlNBPALLimit());
        System.out.println(ln.getCurrentLoanAmount());
    }
    

}
