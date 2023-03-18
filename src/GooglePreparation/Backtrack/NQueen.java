package GooglePreparation.Backtrack;

import java.util.ArrayList;
import java.util.Arrays;

public class NQueen {
    static Integer[] list = new Integer[4];

    static void printBoard(int[][] board, int n){
        for(int i=0; i<n ; i++){
            for (int j=0; j<n; j++){
                System.out.print(board[i][j]+ " ");
            }
            System.out.println();
        }
    }

    static boolean isSafe(int[][] board, int row, int col, int n){

        // check the current row if any queen is present
        for(int i=0; i<col ; i++){
            if(board[row][i] == 1){
                return false;
            }
        }

        for(int i= 0;i<row; i++){
            if(board[i][col] ==1){
                return false;
            }
        }

        // check diagonally down left
        for(int i=row +1 , j=col+1; i<n && j<n; i++, j++){
//            System.out.println(i + " " + j);
//            System.out.println(board[i][j]);
            if(board[i][j] == 1){
                return false;
            }
        }

        for(int i = row - 1, j = col -1; i >=0 && j>=0 ; i--, j--){
//            System.out.println(i + " " + j);
//            System.out.println(board[i][j]);
            if(board[i][j] == 1){
                return false;
            }
        }

        return true;
    }

    static boolean placeUtil(int board[][],int col, int n){
        if(col >=n){
            return true;
        }

        for (int i =0 ;i<n;i++){
            if(isSafe(board, i, col,n)) {
                board[i][col] = 1;
                if(placeUtil(board, col+1, n)){
                    return true;
                }
                board[i][col] = 0;
            }
        }
        return false;
    }


    public static void main(String[] args) {

        int n = 4;
        int board[][] = new int[n][n];

//        board[0][1] = 1;
//        board[1][2] = 1;
//        System.out.println(isSafe(board, 2,1,n));
        System.out.println(placeUtil(board, 0,  n));
        System.out.println(Arrays.toString(list));
        printBoard(board, n);
    }
}
