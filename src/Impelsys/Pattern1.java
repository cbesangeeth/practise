package Impelsys;

public class Pattern1 {

    public static void main(String[] args) {

        int input = 5;
        int start = 1;

        for (int i=0; i< input; i++){
            for(int j=0; j<=i;j++){
                System.out.print(start+" ");
                start++;
            }
            System.out.println();
        }
    }
}
