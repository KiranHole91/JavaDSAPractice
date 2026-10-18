package ComparableComparator;

import java.util.Comparator;

public class ByEmpID implements Comparator<Emp>{

    @Override
    public int compare(Emp o1, Emp o2) {
        
        return (int) (o1.getEmpId() - o2.getEmpId());
    }
    
}
