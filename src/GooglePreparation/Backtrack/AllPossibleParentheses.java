package GooglePreparation.Backtrack;

import javax.swing.*;
import java.util.Arrays;

public class AllPossibleParentheses {


    static void fillRecursive(char[] c, int pos, int n, int open, int close){
        if(close == n){
            for(int i=0;i<c.length;i++)
                System.out.print(c[i]);
            System.out.println();
            return;
        } else{
            if(open > close){
                c[pos] = '}';
                fillRecursive(c, pos+1, n, open, close+1);
            }

            if(open < n){
                c[pos] = '{';
                fillRecursive(c, pos +1, n, open+1, close);
            }
        }

    }


    public static void main(String[] arg){

        int n = 2;
        char[] c = new char[2*n];
        fillRecursive(c, 0, n, 0,0);
        System.out.println(Arrays.toString(c));
    }

}
