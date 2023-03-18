package GooglePreparation.Array;

import java.util.Arrays;

public class SecondLargestNumber {

    public static void main(String[] args) {
        int[] arr = {3,5,2,6,7,8};
//        int[] arr = {12, 35, 1, 10, 34, 1};

        int min = 0;
        int max = 0;

        // O(n)
        for(int i=0 ; i<arr.length; i++){
            if(arr[i] > max){
                min = max;
                max = arr[i];
            } else if(arr[i] > min){
                min = arr[i];
            }
        }

        System.out.println(min);

        // O(n log(n))
//        Arrays.sort(arr);
//        System.out.println(arr[arr.length-1]);
    }

}
