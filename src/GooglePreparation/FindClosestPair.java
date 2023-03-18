package GooglePreparation;

import java.util.Arrays;

public class FindClosestPair {

    public static void main(String[] args) {

        int[] a1 = {-1, 3, 8, 2, 9, 5};
        int[] a2 = {4, 1, 2, 10, 5, 20};
        int aTarget = 24;

        System.out.println(Arrays.toString(closestPair(a1, a2, aTarget)));

    }

    static int[] closestPair(int[] a1, int[] a2, int target) {
        Arrays.sort(a1);
        Arrays.sort(a2);

        int i = 0;
        int j = a2.length - 1;
        int diff = a1[0] + a2[0] - target;
        int[] closetPair = {a1[0], a2[0]};

        while (i < a1.length && j >= 0) {
            int currentDiff = a1[i] + a2[j] - target;
            if (currentDiff < diff) {
                diff = currentDiff;
                closetPair[0] = a1[i];
                closetPair[1] = a2[j];

            }

            if (currentDiff == 0) {
                return closetPair;
            } else if (currentDiff < 0) {
                i++;
            } else {
                j--;
            }



        }

        return closetPair;
    }
}
