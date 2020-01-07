package hackerrank.java;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.text.ParsePosition;
import java.time.LocalDateTime;
import java.util.*;

public class CurrencyFormat {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double payment = scanner.nextDouble();
        scanner.close();

        NumberFormat numberFormat = new DecimalFormat(String.valueOf(payment));
        // Write your code here.
        Locale locale = new Locale("US");
        Currency currency = Currency.getInstance(locale);
        String symbol = currency.getSymbol();
        System.out.println(symbol);

        System.out.println(Currency.getInstance(Locale.US).getCurrencyCode());
        System.out.println(Currency.getInstance(Locale.US).getSymbol());

//        System.out.println("US: " + us);
//        System.out.println("India: " + india);
//        System.out.println("China: " + china);
//        System.out.println("France: " + france);
    }
}
