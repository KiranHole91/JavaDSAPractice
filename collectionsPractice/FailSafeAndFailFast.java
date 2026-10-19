import java.util.*;
import java.util.concurrent.CopyOnWriteArrayList;
public class FailSafeAndFailFast {
    //ConcurrentModificationException & Removing from a list inside a for-each loop throws. 
    public static void main(String[] args) {
    List<String> ls = new ArrayList<>(List.of("Kiran","Dhruv","Daksh","Jyoti","Hole"));

        try{
            for(String s : ls)
            {
            if(s.equals("Kiran"))
                ls.remove(s);   
            }
        }  catch(ConcurrentModificationException e)
             {
                System.out.println("for-each + remove ---> ConcurrentModificationException");
             }

     // Solution 1 : use Iterator.remove()
        Iterator itr = ls.iterator();
        while(itr.hasNext())
            {
                if(itr.next().equals("Daksh"))
                    itr.remove();
            }        
        System.out.println(ls); 
    
    // Solution 2 : fail-safe collection iterates over a copy
        List<String> copy = new CopyOnWriteArrayList<>(List.of("Hole","Kiran","Jyoti"));
        for(String s : copy)
        {
            if(s.equals("Hole"))
                copy.remove(s);
        }
        System.out.println("CopyOnWriteArrayList Fail=safe : "+copy);
    
    // solution 3 : removeIf
        ls.removeIf(t -> t.equals("Hole"));
        System.out.println("Java8 removeIf() : "+ls);

}
}
