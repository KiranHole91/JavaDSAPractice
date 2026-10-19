package SetDemo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class HashSetTreeSet {
    public static void main(String[] args) {
        ArrayList<Integer> al = new ArrayList<>(Arrays.asList(10,20,50,100,70,200));
        HashSet<Integer> hs = new HashSet<>();
        hs.add(100);
        hs.add(20);
        hs.add(200);
        hs.add(100);
        System.out.println("size : "+hs.size());
        hs.addAll(al);
        System.out.println("size2 : "+hs.size());
        Iterator itr = hs.iterator();
        while(itr.hasNext())
        {
            System.out.println(itr.next());

        }

        //LinkedHashSet
        HashSet<Integer> lhs = new LinkedHashSet<>();
        lhs.add(100);
        lhs.add(5);
        lhs.addAll(hs);
        System.out.println("size of LHS : "+lhs.size());

        Iterator<Integer> itr2 = lhs.iterator();
        while(itr2.hasNext())
        {
            System.out.println(itr2.next());

        }

        TreeSet<Integer> ts = new TreeSet<>(Arrays.asList(100, 50, 250,20));
        ts.addAll(hs);
        System.out.println("size of TreeSet : "+lhs.size());

        Iterator<Integer> itr3 = ts.iterator();
        while(itr3.hasNext())
        {
            System.out.println(itr3.next());

        }
       


    }
}
