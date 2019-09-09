public class StringPattern {


    public static void main (String a[]){

        int n = 3;
        int size = n+2;

        int space = n;

        for(int i=1 ; i<=n ; i++){
            printSpace(n-i);
            for(int j = 1 ; j<=i; j++){
                    System.out.print("* ");
            }
            System.out.println();

        }
    }

    private static void printSpace(int n){
        for(int i=0; i<n ; i++){
            System.out.print(" ");
        }
    }
}
