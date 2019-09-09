import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.regex.Pattern;

public class RegexDemo {

    public static void main (String[] a){

        String patternString = "^[a-zA-Z0-9]+([-/]{1}[0-9A-Za-z]+)*$";
       // String input = "A-3333-3";
       List<String> inputs = Arrays.asList("SPA-01",
               "SPA-01-01",
               "IMP/01",
               "T-01",
               "1",
               "123",
               "a",
               "ne-ad",
               "ABC",
               "ABC123",
               "1/WE",
               "FR-001",
               "F/E-001",
               "T-T-T",
               "t-t-t",
               "1234");

        Predicate pattern =    Pattern.compile(patternString).asPredicate();

        inputs.forEach(input->{
            if(pattern.test(input)){
                System.out.println(input+": "+true);
            }else
                System.out.println(input+": "+false);
        });


        String abc = "  a bc";
        System.out.println(abc.trim());

        /*if (!pattern.matcher(input).matches()) {
            throw new IllegalArgumentException("Invalid String");
        } else{
            System.out.println("valid");
        }*/
    }
}
