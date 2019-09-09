package techgig;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Neighbour {

    public static void main(String[] args) throws IOException {
        BufferedReader bf= new BufferedReader(new InputStreamReader(System.in));

        int t= Integer.parseInt(bf.readLine());

        while(t-- >0) {
            int n = Integer.parseInt(bf.readLine());

            String[] input = bf.readLine().split(" ");
            int[] numbers = Arrays.stream(input).mapToInt(Integer::parseInt).toArray();

            int oddSum = 0;
            StringBuilder odd = new StringBuilder();
            StringBuilder even = new StringBuilder();

            int evenSum = 0;

            for(int i=0; i<n; i++){
                if(i%2 == 0){
                    evenSum =+ numbers[i];
                    even.append(numbers[i]);
                } else{
                    oddSum =+ numbers[i];
                    odd.append(numbers[i]);
                }
            }

            Arrays.sort(numbers);
            if(numbers[n-1]> oddSum || numbers[n-1]>evenSum){
                System.out.println(numbers[n-1]);
            }else if (oddSum>evenSum){
                System.out.println(oddSum);
            }
        }
    }
}
