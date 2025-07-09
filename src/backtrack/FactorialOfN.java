package org.codesimple.backtrack;

public class FactorialOfN {

    public static void main(String[] args) {
        int n= 14;
        int result = 1;

        backtrack(n, result);

        result = backtrackFn(n);
        System.out.println(result);
    }

    public static int backtrackFn(int n){

        if(n==1){
            return 1;
        }

        return n * backtrackFn(n-1);
    }

    public static void backtrack(int n, int result){
        if(n<1){
            System.out.println(result);
            return;
        }

        backtrack(n-1, result*n);

    }
}
