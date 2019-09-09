package skillenza;

import java.util.Scanner;

public class QueenMove {


    public static void main(String[] args) {

        //int n = 4;
        //int r = 3;
        //int c = 4;

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for(int i=0; i<n ;i++){
            int martix = sc.nextInt();

            String line = sc.nextLine().replaceAll("[^0-9]", "");

            String row = String.valueOf(line.charAt(0));
            String column= String.valueOf(line.charAt(1));

            System.out.println(calculate(martix, Integer.parseInt(row), Integer.parseInt(column)));
        }

      /*  int chess[][] = new int[n][n];

        int diff = r-c;
        int diff2 = r+c;
        int count =1;

        for (int i = n; i >= 1; i--) {
            for (int j = 1; j <= n; j++) {
                System.out.print("(" + i + "," + j + ") ");
                if (i == r || j == c) {
                    chess[i - 1][j - 1] = 0;
                } else if (diff==(i-j) ) {
                    chess[i - 1][j - 1] = 0;
                } else if (diff2==(i+j) ) {
                    chess[i - 1][j - 1] = 0;
                } else {
                    chess[i - 1][j - 1] = 1;
                    count++;
                }
                System.out.print(chess[i - 1][j - 1] + " ");
            }
            System.out.println();
        }
        System.out.println(count);*/


    }

    private static int calculate(int n, int r, int c) {

        int diff = r-c;
        int diff2 = r+c;
        int count =1;

        int total = n*n;

        for (int i = n; i >= 1; i--) {

            for (int j = 1; j <= n; j++) {

                if(diff!=(i-j) && diff2!=(i+j) && i!=r && j!=c){
                    count++;
                }
            }
           // System.out.println();
        }
        return count;
    }
}
