package hackerrank.java;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

//https://www.hackerrank.com/challenges/ctci-array-left-rotation/problem?h_l=interview&playlist_slugs%5B%5D=interview-preparation-kit&playlist_slugs%5B%5D=arrays
public class LeftRotateArray {

    // Complete the rotLeft function below.
    static int[] rotLeft(int[] a, int d) {

        d = d >= a.length? d - a.length : d;

        List<Integer> list = Arrays.stream(a).boxed().collect(Collectors.toList());

        List<Integer> lastPart = list.subList(0, d);
        List<Integer> firstPart = list.subList(d, a.length);

        firstPart.addAll(lastPart);

        return firstPart.stream().mapToInt(value -> value).toArray();
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {

        String[] nd = scanner.nextLine().split(" ");

        int n = Integer.parseInt(nd[0]);

        int d = Integer.parseInt(nd[1]);

        int[] a = new int[n];

        String[] aItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int aItem = Integer.parseInt(aItems[i]);
            a[i] = aItem;
        }

        int[] result = rotLeft(a, d);

        for (int i = 0; i < result.length; i++) {
            System.out.printf(String.valueOf(result[i]));

            if (i != result.length - 1) {
//                bufferedWriter.write(" ");
            }
        }


        scanner.close();
    }
}
