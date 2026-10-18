import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicateWords {


    public static void main(String[] args) {
        String str = "My  name name is Hole Kiran Hole";
        //Read each word in String in first seen without duplicates & Keeping order
        
        Set<String> set = new LinkedHashSet<>();
        for (String s : str.trim().split(" ")) {
            set.add(s);
        }

        System.out.println(String.join(" ", set));

        //Find common words
        Set<String> set1 = new LinkedHashSet<>(Set.of("Kiran", "Dhruv", "Jyoti", "Daksh"));
        Set<String> set2 = new LinkedHashSet<>(Set.of("Kiran", "Lata", "Jyoti"));
        set1.retainAll(set2);
        System.out.println("Common : "+set1);

    }
}
