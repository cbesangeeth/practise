package org.codesimple.backtrack;

import java.util.HashMap;

public class Fibonacci {

    static HashMap<Integer, Long> map = new HashMap<>();

    public static void main(String[] args) {
        int k = 1;

        //        0,1,1,2,3,5,8,..

        System.out.println(backtrack(k));
    }

    public static long backtrack(int k) {
        if (map.getOrDefault(k, 0l) > 0) {
            return map.get(k);
        }

        if (k <= 1) {
            return k;
        }

        long result = backtrack(k - 1) + backtrack(k - 2);

        map.put(k, result);
        return result;
    }
}
