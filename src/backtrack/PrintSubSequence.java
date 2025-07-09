package org.codesimple.backtrack;

import java.util.ArrayList;
import java.util.List;

public class PrintSubSequence {

    public static void main(String[] args) {
        int[] array = {3,2,1};
        List<Integer> result = new ArrayList<>();
        backtrack(0,array, result);
    }

    public static void print(List<Integer> result){
        System.out.println(result);
    }

    public static void backtrack(int index, int[] array, List<Integer> result){
        if(index == array.length){
            print(result);
            return;
        }

        backtrack(index+1, array, result);
        result.add(array[index]);

        backtrack(index+1, array, result);
        result.remove(result.size() -1);
    }
}
