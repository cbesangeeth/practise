package skillenza;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;

public class SearchEngine{
    public static void main(String[] args) throws IOException {
// TODO Auto-generated method stub
        Scanner scan = new Scanner(System.in);
//BufferedReader scan = new BufferedReader(new InputStreamReader(System.in));
        int noOfStrings = scan.nextInt();
        String[] inputStrings = new String[noOfStrings];

        for (int z=0;z<noOfStrings;z++) {
            inputStrings[z] = scan.nextLine();
        }
        List<String> elements = new ArrayList();
        Map<String,Integer> mapElements = new TreeMap<>();
        boolean print = false;
        int noOfOutputs = 0;
        for (int i=0;i<inputStrings.length;i++) {

            if (inputStrings[i].charAt(0) >= 'a' && inputStrings[i].charAt(0) <= 'z' ||
                    inputStrings[i].charAt(0) >= 'A' && inputStrings[i].charAt(0) <= 'Z') {
                if (!inputStrings[i].substring(0, 3).equals("top")) {
                    elements.add(inputStrings[i]);
                }
                else {
                    noOfOutputs = Integer.valueOf(inputStrings[i].charAt(inputStrings[i].length()-1));
                    print = true;
                    for (int j=0;j<elements.size();j++) {
                        if (j == 0)
                            mapElements.put(String.valueOf(elements.get(j)), 1);
                        else {
                            if(mapElements.containsKey(elements.get(j))) {
                                int existingValue = (int)mapElements.get(elements.get(j));
                                mapElements.remove(elements.get(j));
                                mapElements.put(String.valueOf(elements.get(j)), existingValue+1);
                            }
                            else {
                                mapElements.put(String.valueOf(elements.get(j)), 1);
                            }
                        }
                    }
                }
            }
            if(print) {
                LinkedHashMap<String, Integer> sortedMap = new LinkedHashMap<>();
                mapElements.entrySet().stream().sorted(Map.Entry.comparingByValue(Comparator.reverseOrder())).forEachOrdered(x -> sortedMap.put(x.getKey(), x.getValue()));
                Set<String> set = sortedMap.keySet();
                int noOfTimes = 1;
                for (String key:set) {
                    if(noOfTimes <= noOfOutputs)
                        System.out.print(key+" ");
                    else
                        break;
                    noOfTimes++;
                }
                print = false;
                noOfOutputs = 0;
                mapElements.clear();
                elements.clear();
                System.out.println();
            }
        }
    }

}