package org.codesimple.Arrays;

import java.util.ArrayList;
import java.util.List;

public class IsAnagram {

    public static void main(String args[]){


        String s1 = "racecarm";
        String s2 = "caroraca";

        boolean result = isAnagram(s1,s2);
        System.out.println(result);
        System.out.println(isAnaramOpt(s1,s2));

    }

    public static boolean isAnagram(String s1, String s2){
        boolean result = false;

        if(s1.length() != s2.length()){
            return result;
        }

        List<Character> s1CharList = new ArrayList<>();
        for(int i=0; i<s1.length(); i++){
            s1CharList.add(s1.charAt(i));
        }

        for(int i=0; i<s2.length(); i++){
            if(s1CharList.contains(s2.charAt(i))){
                s1CharList.remove(s1CharList.indexOf(s2.charAt(i)));
            } else {
                return result;
            }
        }

        return true;
    }

    public static boolean isAnaramOpt(String s1, String s2) {

        int[] arr = new int[26];

        for(int i=0; i< s1.length(); i++){
            arr[s1.charAt(i) - 'a']++;
            arr[s2.charAt(i) - 'a'] --;
        }

        for(int i=0; i< arr.length ; i++){
            if(arr[i]>0) {
                return false;
            }
        }

        return true;

    }
}
