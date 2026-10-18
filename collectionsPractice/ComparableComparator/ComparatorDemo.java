package ComparableComparator;
import java.util.ArrayList;
import java.util.Collections;

public class ComparatorDemo {
    
    public static void main(String[] args) {
        
    
        Emp e = new Emp(110, "Kiran", 10000);
        Emp e1 = new Emp(100, "Dhruv", 20000);
        Emp e2 = new Emp(120, "Daksh", 30000);

        ArrayList<Emp> list = new ArrayList<>();
        list.add(e);
        list.add(e1);
        list.add(e2);

        System.out.println(list);

        Collections.sort(list, new ByEmpID());

        System.out.println("ByEmpID Comparator :"+list);

        Collections.sort(list, new ByEmpName());
        System.out.println("ByEmpName Comparator :"+list);
    }  
}
