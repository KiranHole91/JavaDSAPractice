package ComparableComparator;

public class Emp implements Comparable<Emp> {
    
    private long empId;
    private String empName;
    private long salary;

     @Override
    public int compareTo(Emp o) {
        return (int) (this.empId - o.empId);
    }
   

    Emp(long empID, String empName, long salary)
    {
        this.empId =  empID;
        this.empName = empName;
        this.salary = salary;
    }

    public void setEmpId(long empId) {
        this.empId = empId;
    }
    public void setEmpName(String empName) {
        this.empName = empName;
    }
    public void setSalary(long salary) {
        this.salary = salary;
    }
    
    public long getEmpId() {
        return empId;
    }

    public String getEmpName() {
        return empName;
    }
    
    public long getSalary() {
        return salary;
    }

   

     @Override
    public String toString() {
        return "Emp [empId=" + empId + ", empName=" + empName + ", salary=" + salary + "]";
    }

    
}
