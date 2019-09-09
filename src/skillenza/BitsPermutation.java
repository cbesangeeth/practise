package skillenza;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class BitsPermutation {

    static Map<String, Set<String>> result = new HashMap<>();
    public static void main(String... A) throws IOException {

        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(bf.readLine());

        while(t-- >0){

            Map<String, String> cache = new HashMap<>();
            Set<String> output = new HashSet<>();

            String str = Integer.toBinaryString(Integer.parseInt(bf.readLine()));
            if (result.containsKey(str)) {
               output = result.get(str);
            } else {
                recursive("", str, output,cache);
                result.put(str, output);

            }

            int c = output.stream().map(e-> Integer.parseInt(e ,2)).reduce((integer, integer2) -> integer+integer2).get();
            System.out.println(c);
        }


    }

    private static void recursive(String prefix, String str, Set<String> output, Map<String, String> cache) {

        if (cache.containsKey(prefix + "-" + str)) {
            //System.out.println(cache.get(prefix+"-"+str));
        } else {
            // cache the combination
            cache.put(prefix + "-" + str, "");

            int n = str.length();
            if (n == 1) {
                output.add(prefix + str);
                System.out.println(prefix + str);
            } else {
                for (int i = 0; i < n; i++) {
                    recursive(prefix + str.charAt(i), str.substring(0, i) + str.substring(i + 1, n), output, cache);
                }
            }
        }

    }
}
