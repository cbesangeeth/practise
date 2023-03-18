package FindName;

import java.io.*;
import java.util.HashMap;
import java.util.Locale;

public class FindNumerologyNames {

    static HashMap<Character, Integer> numMap = new HashMap<>();

    static {
        numMap.put('a', 1);
        numMap.put('i', 1);
        numMap.put('j', 1);
        numMap.put('q', 1);
        numMap.put('y', 1);
        numMap.put('b', 2);
        numMap.put('k', 2);
        numMap.put('r', 2);
        numMap.put('c', 3);
        numMap.put('g', 3);
        numMap.put('l', 3);
        numMap.put('s', 3);
        numMap.put('d', 4);
        numMap.put('m', 4);
        numMap.put('t', 4);
        numMap.put('e', 5);
        numMap.put('h', 5);
        numMap.put('n', 5);
        numMap.put('x', 5);
        numMap.put('u', 6);
        numMap.put('v', 6);
        numMap.put('w', 6);
        numMap.put('o', 7);
        numMap.put('z', 7);
        numMap.put('p', 8);
        numMap.put('f', 8);
    }


    public static void main(String[] args) {
        File file = new File("/home/sangeeth/Desktop/knames");
        try (BufferedReader br = new BufferedReader(new FileReader(file))) {
            String line;
            while ((line = br.readLine()) != null) {
//                System.out.println(line);
                calculateNumeric(line);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void calculateNumeric(String name) {
        String eachName = name.trim().toLowerCase();
        int sum =0;
        for(int j=0; j < eachName.length(); j++) {
            char eachChar = eachName.charAt(j);
            sum += numMap.containsKey(eachChar)? numMap.get(eachChar) : 0;
        }

        System.out.println(eachName + " -> " + (sum + 0));
    }
}
