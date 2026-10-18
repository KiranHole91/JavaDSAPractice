package collectionsPractice;

import java.util.TreeMap;

public class TreeMapPractice {
    public static void main(String[] args) {
        
        TreeMap<Integer,String> tm = new TreeMap<>();

        tm.put(28, "Kiran");
        tm.put(14, "Jyoti");
        tm.put(9, "Dhruv");
        tm.put(22, "Daksh");

        System.out.println("Sorted TreeMap :"+tm);
        System.out.println("First : " +tm.firstKey()+" & Last : "+tm.lastKey());
        System.out.println("DESC : "+tm.descendingMap());
        System.out.println("Nearest at or below 17 : "+tm.floorKey(17));
        System.out.println("Before 14 :"+tm.headMap(14));
        System.out.println("Submap : "+tm.subMap(9,22));
    }
}
