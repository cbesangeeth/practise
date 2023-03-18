package Impelsys;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SumTheWholeList {
    public static void main(String[] args) {
        List<Integer> input = Arrays.asList(89, 34,2,4324, 21,3,4);
        int sum = 0;
        for (int i=0;i<input.size();i++){
            List<Integer> each = getEachInt(input.get(i));

            for(int j=0; j< each.size(); j++) {
                sum = each.get(j) + sum;
            }
        }

        System.out.println(sum);

    }
    public static List<Integer> getEachInt(int value){

        List<Integer> result = new ArrayList<>();
        while(value>0){
            int t = value % 10;
            value = value /10;
            result.add(t);
        }

        return result;
    }

}
