package org.codesimple.backtrack;

import java.util.ArrayList;
import java.util.List;

public class IndentifySum {

//    public static void main(String[] args) {
//        int[] arr = { 1, 2, 4, 5, 6, 7, 3 };
//        int target = 4;
//
//        boolean result = findTheTargetSum(arr, target);
//        System.out.println(result);
//    }
//
//    public static boolean findTheTargetSum(int[] arr, int target) {
//
//        return false;
//    }

    public static void main(String[] args) {
        int[] nums = {1, 2};
        List<List<Integer>> result = new ArrayList<>();
        backtrack(nums, 0, new ArrayList<>(), result);

        System.out.println("All subsets:");
        for (List<Integer> subset : result) {
            System.out.println(subset);
        }
    }

    // Backtracking function
    private static void backtrack(int[] nums, int index, List<Integer> current, List<List<Integer>> result) {
        // Add the current subset to the result
        result.add(new ArrayList<>(current));

        // Try to add each element starting from 'index'
        for (int i = index; i < nums.length; i++) {
            // Choose
            current.add(nums[i]);

            // Explore
            backtrack(nums, i + 1, current, result);

            // Un-choose (backtrack)
            current.remove(current.size() - 1);
        }
    }
}
