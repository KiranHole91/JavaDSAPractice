package OOPS;
public class Overdrafts extends BusinessCustomer {

    Overdrafts(int cust_ID) {
        super(cust_ID);
        //TODO Auto-generated constructor stub
    }

    private int currentODBorrowing;

    public static void main(String[] args) {
        Overdrafts od = new Overdrafts(1234);
         od.setoDBPALLimit(25000);
      
        System.out.println(od.getodBPALLimit());
    }

    public int getCurrentODBorrowing() {
        return currentODBorrowing;
    }
    public void setCurrentODBorrowing(int currentODBorrowing) {
     
        this.currentODBorrowing = currentODBorrowing;
    }

    @Override
    public void setCurrentLoanAmount(int currentLoanAmount) {
        // TODO Auto-generated method stub
        super.setCurrentLoanAmount(currentLoanAmount);
    }


    
}
