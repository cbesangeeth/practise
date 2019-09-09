package skillenza;

import java.util.Scanner;

class Queen2 {


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            int martix = sc.nextInt();

            String line = sc.nextLine().replaceAll("[^0-9]", "");

            String row = String.valueOf(line.charAt(0));
            String column = String.valueOf(line.charAt(1));

            System.out.println(calculate(martix, Integer.parseInt(row), Integer.parseInt(column)));
        }


    }

    private static int calculate(int n, int r, int c) {

        int count = 0;
        int total = n * n;
        int hor_ver = (n * 2) - 1;

        //System.out.print("total->" + total);


       // System.out.print("hor->" + hor_ver);

        int leftUp = n - r;
        int leftDown = (n - leftUp) - 1;
       // System.out.println("leffUp->" + leftUp);
        //System.out.println("down->" + leftDown);

        int leftCount = (leftDown + leftUp);
        //System.out.println("count->" + count);

        count = count + leftCount;
        //System.out.println("count->" + count);

        int rightUp = n - r;
        int rightDown = (n - rightUp) - 1;

        count = count + rightDown + rightUp;


       /* int right = n-c;
        System.out.print("rifht"+ right);

        if(right>0){
            count =+ (int)(Math.pow(2,right));
        }*/

        count = count + hor_ver;
        System.out.println("count->" + count);

        return total - count + 1;
    }
}
