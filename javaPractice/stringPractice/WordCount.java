import java.util.HashMap;

public class WordCount {

    public static void main(String[] args) {
        String text = "Test early, test often. Automate the test, not the Testing.";

        HashMap<String, Integer> hm = new HashMap<>();

        for (String word: text.toLowerCase().trim().replaceAll("[^a-z ]", "").split(" "))
        {
            hm.put(word, hm.getOrDefault(word, 0) + 1);
        }

        hm.forEach((word, ch) -> System.out.println(word+ " : " +ch));
    }
    
}
