package hackerrank;

import java.util.HashMap;

public class LCS2 {
    public static HashMap<String, Integer> map = new HashMap<>();

    public static void main(String args[] ) throws Exception {
        String str1 ="abcba";             // Reading input from STDIN
        String str2 = "acab";


        System.out.println(calculate(str1.toCharArray(),str2.toCharArray()));


    }

    private static int calculate(char[] s1, char[] s2){

        int m = s1.length;
        int n = s2.length;
        int matrix[][] = new int[m+1][n+1];
        int result = 0;

        for(int i=0 ; i<=m; i++){
            for(int j=0; j<=n ; j++){
                if (i == 0 || j == 0)
                    matrix[i][j] = 0;
                else if (s1[i - 1] == s2[j - 1])
                {
                    matrix[i][j] = matrix[i - 1][j - 1] + 1;
                    result = Integer.max(result, matrix[i][j]);
                }
                else
                    matrix[i][j] = 0;
            }
        }
        return result;
    }
}
