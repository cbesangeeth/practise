package java8;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class OptionalsDemo {

    public static void main(String a[]) {

        // empty optional

        Optional<Integer> emptyOptional = Optional.empty();

        System.out.println(emptyOptional);

        List<String> rawNumbers = Arrays.asList("1", "2", null);

        List<Integer> numbers = rawNumbers
                .stream()
                .map(Optional::ofNullable)
                .map(OptionalsDemo::parseToInt)
                .collect(Collectors.toList());

        System.out.println(rawNumbers);
        System.out.println(numbers);
    }

    public static Integer parseToInt(Optional<String> optional) {
        return optional.map(Integer::parseInt).orElse(0);
    }
}
