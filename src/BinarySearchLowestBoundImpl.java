package org.codesimple;

import java.util.Arrays;

public class BinarySearchLowestBoundImpl {

    public static void main(String arg[]) {

        int[] array = new int[] { 1,2,4,6,6};
        Arrays.sort(array);
        int target = 5;

        int result = lowestBound(array, target);
        System.out.println(result);

        array = new int[] {3,5,8,15,19};
        target = 9;
        result = upperBound(array, target);
        System.out.println(result);
    }

    public static int lowestBound(int[] nums, int target){
        int ans = nums.length;
        int left =0, right = nums.length - 1;

        while(left <=right){
            int mid = (left + right) / 2;

            if(nums[mid] >= target) {
                ans = mid;
                right = mid -1;
            } else {
                left = mid +1;
            }
        }


        return ans;
    }

    public static int upperBound(int[] nums, int x) {

        int ans= nums.length;
        int left = 0, right = ans -1;

        while(left <= right){
            int mid = (left + right)/2;

            if(nums[mid] > x){
                ans = mid;
                right = mid - 1;
            } else {
                left = mid + 1 ;
            }
        }

        return ans;
    }
}
