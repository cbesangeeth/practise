package hackerrank.pattern;

import java.util.*;

public class Pattern {

    private static final Scanner scanner = new Scanner(System.in);

    // Complete the staircase function below.
    static void staircase(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = n; j >= 1; j--) {
                if (i < j) {
                    System.out.print(" ");
                } else {
                    System.out.print("#");
                }
            }
            if (i != n) {
                System.out.println();
            }
        }

    }

    public static void main(String[] args) {
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        staircase(n);

        scanner.close();
    }

}
