import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class ListIteratorAndIterator {
 
     public static void main(String[] args) {
        List<String> steps = new ArrayList<>(List.of("open", "login", "logout"));
       
        ListIterator<String> listitr = steps.listIterator();       
        while (listitr.hasNext()) {
            String s = listitr.next();
            listitr.set(s.toUpperCase());                 // safe update
            if (s.equals("login")) 
                listitr.add("VERIFY");  // safe insert
        }
        System.out.println("Forward: " + steps);
        System.out.print("Backward: ");
        while (listitr.hasPrevious()) 
            System.out.print(listitr.previous() + " ");
        System.out.println();

        List<String> ls = new ArrayList<>(List.of("Kiran", "Daksh", "Dhruv"));
        Iterator<String> itr = ls.iterator();
        while(itr.hasNext())
        {
            System.out.println(itr.next());
        }

    }

}
