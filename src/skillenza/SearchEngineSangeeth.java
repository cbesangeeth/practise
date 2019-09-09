package skillenza;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;
import java.util.stream.Collectors;

class SearchEngineSangeeth{

    static StringBuilder sbMain = new StringBuilder();

    public static void main(String arg[]) throws IOException{
        BufferedReader bf= new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(bf.readLine());

        while(t-- >0){
            int n = Integer.parseInt(bf.readLine());
            TreeMap<String, Integer> map = new TreeMap<>();

            for (int i = 0; i < n; i++) {
                String searchKey = bf.readLine();
                if (searchKey.contains("top ")) {
                    printTopSearchStrings(map, Integer.parseInt(searchKey.substring(4,searchKey.length())));
                    continue;
                }

                if (!map.containsKey(searchKey)) {
                    map.put(searchKey, 1);
                } else {
                    map.put(searchKey, map.get(searchKey) + 1);
                }
            }

        }
        System.out.println(sbMain.toString());

    }

    private static void printTopSearchStrings(TreeMap<String, Integer> map, int top) {

        Map<String, Integer> sortedMap = map.entrySet()
                .stream()
                .sorted(Collections.reverseOrder(Map.Entry.comparingByValue()))
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (e1, e2) ->
                        e2, LinkedHashMap::new));

        StringBuilder sb =new StringBuilder();
        for (Map.Entry<String, Integer> key : sortedMap.entrySet()) {
            if(top-- >0){
                sb.append(key.getKey()+ " ");
            }else{
                break;
            }
        }
        sb.append("\n");
        sbMain.append(sb);
    }
}