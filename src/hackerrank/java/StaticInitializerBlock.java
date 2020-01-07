package hackerrank.java;

import java.util.Scanner;

public class StaticInitializerBlock {

    static int B, H;
    static boolean flag;

    static {
        Scanner sc = new Scanner(System.in);
        B = sc.nextInt();
        H = sc.nextInt();
        flag = (B > 0) && (H > 0) ? true : false;
        if (flag == false) {
            System.out.print("java.lang.Exception: Breadth and height must be positive");
        }
    }

    public static void main(String[] args) {

        if (flag) {
            int area = B * H;
            System.out.print(area);
        }

    }//end of main

}//end of class

