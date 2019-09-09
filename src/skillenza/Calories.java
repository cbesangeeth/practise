package skillenza;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Calories {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            List<Integer> list = new ArrayList();

            while (n-- > 0) {
                list.add(sc.nextInt());
            }

            Collections.sort(list);

            int count = 0;
            int prevSum = 0;
            int total = 0;

            for (int i = list.size()-1; i >= 0; i--) {
                int currentValue = list.get(i);

                if (i == list.size()-1) {
                    total = currentValue;

                } else {
                    total = total + ((2 * prevSum) + currentValue);
                }
                prevSum = prevSum + currentValue;
            }

            System.out.println(total);
        }
    }
}
