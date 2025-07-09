package org.codesimple.backtrack;

public class ReverseAnArray {
    static int[] array = { 1, 2, 3, 4, 5 };

    public static void main(String[] args) {

        int n = array.length;

//        normal loop
        for(int i=0; i<n/2; i++){
            swap(i, n);
        }

        print();

//        backtrack
        backtrack(0, n);
        print();
    }

    public static void swap(int i, int n){
        int temp = array[i];
        array[i] = array[n-i-1];
        array[n-i-1] = temp;
    }

    public static void print(){
        for(int a: array){
            System.out.println(a);
        }
    }

    public static void backtrack(int left, int right){

        if(left >= right/2){
            return;
        }

        swap(left, right);

        backtrack(left+1, right);

    }
}
