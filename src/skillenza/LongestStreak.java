package skillenza;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class LongestStreak {

    public static void main(String[] args) throws IOException {

        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(bf.readLine());

        while(t-- >0){
            int len = Integer.parseInt(bf.readLine());
            String n = bf.readLine();

//            String n = "eygesoznssineggisbbsiininnegniseebny";

            long counter = 0;
            String temp = "";
            Map<Character, Long> myResult = new HashMap<>();

            for (int i = 0; i < n.length(); i++) {
                //System.out.println(n.charAt(i));
                char c = n.charAt(i);
                if (temp.equalsIgnoreCase(String.valueOf(c))) {
                    counter++;
                } else {
                    counter = 1;
                }

                if (myResult.containsKey(c)) {
                    long existingCount = myResult.get(c);
                    if (counter > existingCount) {
                        myResult.put(c, counter);
                    }
                } else {
                    myResult.put(c, 1l);
                }

                temp = String.valueOf(c);
            }

            long max = Collections.max(myResult.values());

            String result = myResult.entrySet().stream()
                    .filter(eachItem -> eachItem.getValue() == max)
                    .map(maxValue -> maxValue.getKey().toString())
                    .sorted(String::compareTo)
                    .collect(Collectors.joining());

            System.out.println(max +" " + result);
        }


    }
}
