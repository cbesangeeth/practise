import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {

        System.out.println("Hello World!");

//        System.out.println("hello injellij");
//
//        List<Integer> number = Arrays.asList(12,43,4,5);
//
//       int a = number.stream()
//                .map(y -> y+1).sorted().
//                reduce(2 ,(ans,i)-> ans+i);
//
//        System.out.print(number);
//        System.out.print(a);

        List<Integer> number = Arrays.asList(2,3,4,5);

        List<String>  numberToString= number.stream().map(x -> x.toString()).collect(Collectors.toList());

        numberToString.forEach(System.out::println );


        Boolean isValid = true;

        System.out.println(isValid!=null ?isValid.toString():"false");
    }

}
