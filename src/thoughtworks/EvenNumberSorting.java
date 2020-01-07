package thoughtworks;

import java.util.Arrays;

/**
 * Sorting the number
 */
public class EvenNumberSorting {

    public static void main(String...args){

        // sort using arrays
        int[] array = {4,24,5,2,54,9};
        Arrays.sort(array);
        Arrays.stream(array)
                .forEach(number -> System.out.println(number));

        // filter only even number and sort
        System.out.println("Filter only even number");
        Arrays.stream(array)
                .filter(number -> (number%2 == 0))
                .forEach(number -> System.out.println(number));
    }

}
