package hackerrank;

public class CricketScoreCalculation {

    public static void main(String... args) {
        String input = "12342NbWd644";

        String runsOnly = input.replaceAll("[^0-9]", "");
        String noBallsAndWides = input.replaceAll("[0-9]", "");
        int extras = noBallsAndWides.length() > 0 ? noBallsAndWides.length() / 2 : 0;
        char[] charArray = runsOnly.toCharArray();

        int b1 = 0;
        int b2 = 0;
        int total = 0;
        boolean b1OnStrike = true;

        for (int i = 0; i < charArray.length; i++) {
            int runs = Integer.parseInt(String.valueOf(charArray[i]));
            total += runs;
            if (b1OnStrike) {
                b1 += runs;
                b1OnStrike = runs % 2 == 0 ? true : false;
            } else {
                b2 += runs;
                b1OnStrike = runs % 2 == 0 ? false : true;
            }

            if (i != 0 && (i % 5 == 0)) {
                b1OnStrike = !b1OnStrike;
            }
        }

        total = total + extras;
        String overs = charArray.length / 6 + "." + charArray.length % 6;

        System.out.println("batsman 1: " + b1);
        System.out.println("batsman 2: " + b2);
        System.out.println("total: " + total);
        System.out.println("extras: " + extras);
        System.out.println("overs: " + overs);
    }
}
