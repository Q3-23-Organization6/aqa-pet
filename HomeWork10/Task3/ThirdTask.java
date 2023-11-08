package HomeWork10.Task3;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ThirdTask {
    public static void main(String[] args) {
        List<String> words = new ArrayList<>();
        words.add("cat");
        words.add("dog");
        words.add("Cat");
        words.add("dino");
        words.add("dInO");
        words.add("dog");
        words.add("Cat");
        words.add("dog");

        Map<String, Integer> wordMap = wordCount (words);

        for (Map.Entry<String, Integer> entry : wordMap.entrySet()) {
            System.out.println("Word: " + entry.getKey() + ", Frequency: " + entry.getValue());
        }
    }

    public static Map<String, Integer> wordCount (List<String> words) {
        Map<String, Integer> wordMap = new HashMap<>();

        for (String word : words) {
            wordMap.merge(word, 1, Integer::sum);
        }

        return wordMap;
    }
}
