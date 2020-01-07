package thoughtworks;

public class Pattern2 {
    public static void main(String... args) {
        int n = 25;

        int count = 1;

        for (int i = 1; i <= n; i++) {
            for (int j = i; j <= count; j++) {
                System.out.print(j + " ");

            }
            count = count+2;
            System.out.println();
        }
    }
}
