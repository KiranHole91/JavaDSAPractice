package OOPS;

public class BusinessCustomer {

    public static void main(String[] args) {
        
    }

    //Encapsulation
    private int cust_ID;
    private int oDBPALLimit;
    private int lNBPALLimit;
    private int currentLoanAmount;

    BusinessCustomer(int cust_ID)
    {
        this.cust_ID = cust_ID;
    }

    public int getodBPALLimit() {
        return oDBPALLimit;
    }

     public int getlNBPALLimit() {
        return lNBPALLimit;
    }

     public void setCust_ID(int cust_ID) {
        if(cust_ID<=0) System.out.println("Enter valid Cust ID"); 
        else 
            this.cust_ID = cust_ID;
     }

     public void setoDBPALLimit(int oDBPALLimit) {
        if(oDBPALLimit<500) System.out.println("OD BPAL limit should be >500"); 
         else
            this.oDBPALLimit = oDBPALLimit;
     }

     public void setlNBPALLimit(int lNBPALLimit) {
        if(lNBPALLimit<1000) System.out.println("Loan BPAL limit should be >1000"); 
        else
             this.lNBPALLimit = lNBPALLimit;
     }

     public int getCurrentLoanAmount() {
         return currentLoanAmount;
     }

     public void setCurrentLoanAmount(int currentLoanAmount) {
        if(cust_ID<=0) System.out.println("Enter valid amount"); 
         else 
            this.currentLoanAmount = currentLoanAmount;
     }

    
}
