package org.codesimple.backtrack;

public class CheckPalindrom {

    public static void main(String[] args) {
        String input = "madams";

        boolean result = backtrack(0, input.length(), input);
        System.out.println(result);
    }

    public static boolean backtrack(int i, int n, String input){

        if(i>=n/2){
            return true;
        }

        if(input.charAt(i) != input.charAt(n-1-i)){
            return false;
        } else {
            return backtrack(i+1, n, input);
        }


    }
}
