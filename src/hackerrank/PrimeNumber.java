package hackerrank;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class PrimeNumber {

    public static void main(String args[]) throws Exception {

        //BufferedReader
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String name = br.readLine();                // Reading input from STDIN

        int n = Integer.parseInt(name);

        for (int i = 2; i <= n; i++) {
            if (i == 2 || i == 3 || i == 5 || i == 7 || i==11) {
                System.out.print(i + " ");
            } else if ( !(i % 2 == 0 || i % 3 == 0 || i % 5 == 0 || i % 7 == 0 || i%11==0)) {
                System.out.print(i + " ");
            }
        }
    }

}
