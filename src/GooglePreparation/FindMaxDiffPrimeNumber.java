package GooglePreparation;

import java.util.ArrayList;
import java.util.TreeSet;

public class FindMaxDiffPrimeNumber {

    public static void main (String arg[]){
        int left = 8;
        int right = 10;

        int result = getMaximumDiff(left, right);
        System.out.println(result);
    }

    static int getMaximumDiff(int left, int right){

        TreeSet<Integer> set = new TreeSet<>();

        for(int i=left; i<=right ; i++){
            boolean isPrime = isPrimeNumber(i);
            if(isPrimeNumber(i)){
                set.add(i);
            }
        }

        if(set.size() ==0){
            return -1;
        }

        if(set.size() == 1){
            return 0;
        }

        System.out.println(set);

        return (set.last() - set.first());
    }

    static boolean isPrimeNumber(int n){
        if(n < 2){
            return false;
        }

        int sqr = Double.valueOf(Math.sqrt(n)).intValue();
        for(int i=2 ;i<=sqr ; i ++){
            if(n%i == 0 ){
                return false;
            }
        }
        return true;
    }
}
