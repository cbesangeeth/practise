package org.codesimple;

import java.util.Arrays;

public class BinarySearchImpl {
    public static void main(String arg[]) {

        int[] array = new int[] { 91, 5, 8, 12, 16, 23, 38, 56, 72, 2 };

        Arrays.sort(array);

        int left = 0, mid = 0, right = array.length - 1;
        int target = 38;

        while (left <= right) {

            mid = (left + right) / 2;

            if(array[mid] == target){
                System.out.println("Found");
                break;
            }

            if (array[mid] > target) {
                right = mid - 1;
            } else if (array[mid] < target) {
                left = mid + 1;
            }
        }

        System.out.println(array[mid]); // 56
        System.out.println(array[left]); // 23
        System.out.println(array[right]); //91
    }
}
