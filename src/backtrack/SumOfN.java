package org.codesimple.backtrack;

public class SumOfN {

    public static void main(String[] args) {
        int n = 300;
        int sum = 0;
        backtrack(n, sum);

        System.out.println(backtrackFunction(n));
    }

    public static void backtrack(int i, int sum) {
        if(i<1) {
            System.out.println(sum);
            return;
        }

        backtrack(i-1, sum + i);
    }


    public static int backtrackFunction(int i){
        if(i ==0){
            return 0;
        }

        return i + backtrackFunction(i-1);

    }
}
