package geeksforgeeks;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

// https://www.geeksforgeeks.org/print-the-frequency-of-each-character-in-alphabetical-order/
public class FrequencyOfCharacters {
    public static void main(String... args) {
        String input = "aabccccddd";

        Map<String, Integer> myResult = new TreeMap<>();

        for (int i = 0; i < input.length(); i++) {
            String ch = String.valueOf(input.charAt(i));
            if (myResult.containsKey(ch)) {
                Integer count = myResult.get(ch) + 1;
                myResult.put(ch, count);
            } else {
                myResult.put(ch, 1);
            }
        }

        myResult.entrySet().stream()
                .forEach(result -> System.out.printf(result.getKey()+result.getValue()));
    }
}
