package org.codesimple;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class FindDuplicateInAArrayString {

    public static void main(String[] arg) {

        String[] input = { "abcdad", "asdfasd", "asd", "maksk" };

        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < input.length; i++) {

            if(duplicateCheck(input[i])) {
                result.add(i);
            }
        }

        System.out.println(result);

    }

    public static boolean duplicateCheck(String input){
        Set<Character> set = new HashSet<>();

        for (int j = 0; j < input.length(); j++) {
            if( ! set.add(input.charAt(j))){
                return true;
            }
        }

        return false;
    }
}
