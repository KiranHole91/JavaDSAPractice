package ComparableComparator;

import java.util.ArrayList;
import java.util.Collections;


public class ComparableDemo  {
    
    public static void main(String[] args) {
        Emp e = new Emp(110, "Kiran", 10000);
        Emp e1 = new Emp(100, "Dhruv", 20000);
        Emp e2 = new Emp(120, "Daksh", 30000);

        ArrayList<Emp> list = new ArrayList<>();
        list.add(e);
        list.add(e1);
        list.add(e2);

        System.out.println(list);

        Collections.sort(list);

        System.out.println("post Comparable :"+list);
        System.out.println("Issue with Comparabale is for a class only one property can be compared or sorted");
        System.out.println("So here we cant sort by EmpName/Salary so we go for --------> Comparator");
    }

    
}
