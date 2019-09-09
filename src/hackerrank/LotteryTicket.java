package hackerrank;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;



class Result {

    /*
     * Complete the 'lotteryCoupons' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts INTEGER n as parameter.
     */

    public static int lotteryCoupons(int n) {
        // Write your code here

        Map<Long, Long> data = new HashMap<>();

        for(long i=1 ; i<=n ; i++){
            long value = calc(i);

            if(data.containsKey(value)){
                data.put(value, data.get(value) + 1);
            }else {
                data.put(value,1l);
            }
        }

        List<Long> s = data.values().stream().collect(Collectors.toList());
        Long max = Collections.max(s);

        return Collections.frequency(s, max);

    }

    private static long calc(long n){

        long m, p, sum = 0;
        m = n;
        while(m > 0)
        {
            p = m % 10;
            sum = sum + p;
            m = m / 10;
        }

        if(sum>9){
            return calc(sum);
        }

        return sum;
    }

    public static void main(String[] a){
        System.out.println(lotteryCoupons(1300));
    }
}