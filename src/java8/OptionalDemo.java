package java8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class OptionalDemo {

    public static void main(String[] args){
        List<Integer> integers = null;

        Optional.ofNullable(integers).ifPresent(a -> System.out.println(a));
    }

}
