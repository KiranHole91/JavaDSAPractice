package collectionsPractice;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

import javax.crypto.AEADBadTagException;

public class ArrayListVSLinkedList {
    public static void main(String[] args) {
        
        ArrayList<String> al = new ArrayList<>(10);
        System.out.println(al.isEmpty());
        al.add("Kiran");
        al.add("Jyoti");
        al.addFirst("Daksh");
        al.addLast("Dhruv");
         System.out.println(al.isEmpty());

        System.out.println("Print via For each");
        for(String str : al)
        {
            System.out.println(str);
        }

        System.out.println("Remove Via Iterator()");
        Iterator itr = al.iterator();
        while (itr.hasNext())
        {
            System.out.println(itr.next());
            itr.remove();
        }


        List<Integer> al2 = new LinkedList<>();
       System.out.println(al2.size());
    
        al2.add(11);
       al2.add(1, 22);
       al2.addFirst(99);
       al2.addLast(0);
       al2.set(2, 20);
       al2.removeLast();
       Iterator itr2 = al2.iterator();
        while (itr2.hasNext())
        {
            System.out.println(itr2.next());
            
        }

        System.out.println("size: "+al2.size());


        
    }
    
}
