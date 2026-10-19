package MapDemo;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class SortMapByValue {
    public static void main(String[] args) {
        Map<String, Integer> salary = new HashMap<>();
        salary.put("Ravi", 60000);
        salary.put("Anu", 85000);
        salary.put("Kiran", 45000);
        salary.put("Meera", 72000);

        // copy entries to a list, sort by value (descending)
        List<Map.Entry<String, Integer>> list = new ArrayList<>(salary.entrySet());
        list.sort(Map.Entry.comparingByValue(Comparator.reverseOrder()));

        // LinkedHashMap keeps the sorted order
        Map<String, Integer> sorted = new LinkedHashMap<>();
        for (Map.Entry<String, Integer> e : list) {
            sorted.put(e.getKey(), e.getValue());
        }
        System.out.println("Sorted By Value: " + sorted);

    }
}