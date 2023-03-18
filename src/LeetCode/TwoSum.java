package LeetCode;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/*
https://leetcode.com/problems/two-sum/
 */
public class TwoSum {

    public int[] twoSum(int[] nums, int target) {
        int[] result = new int[2];
        Map<Integer, Integer> map = new HashMap<>();

        for(int i =0 ;i<nums.length; i++){
            int compliment = target - nums[i];
            if(map.containsKey(compliment) && map.get(compliment) != i ){
                result[0]=i;
                result[1]= map.get(compliment);
                return result;
            }
            map.put(nums[i], i);
        }
        return result;
    }

    public static void main(String[] args) {
        TwoSum ts = new TwoSum();
        int[] result = ts.twoSum(new int[] {3,5,2}, 5);
        System.out.println(Arrays.toString(result));
    }

}
