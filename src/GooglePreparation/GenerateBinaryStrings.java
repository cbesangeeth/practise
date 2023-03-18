package GooglePreparation;

import java.util.ArrayList;

public class GenerateBinaryStrings {

    static ArrayList list = new ArrayList<>();

    public static void main(String arg[]){

        String input = "1?0?1";
        permutation(input.toCharArray(), 0);

        System.out.println(input.length());

    }

    static void permutation(char[] input, int index){

        if(index == input.length ){
            System.out.println(String.valueOf(input));
            list.add(String.valueOf(input));
            return;
        }

        if(input[index]=='?'){
            input[index] = '0';
            permutation(input, index +1);

            input[index] = '1';
            permutation(input, index + 1);

            input[index] = '?';

        } else {
            permutation(input, index + 1);

        }

    }
}
