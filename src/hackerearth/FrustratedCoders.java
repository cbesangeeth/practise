package hackerearth;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FrustratedCoders {

    public static void main(String[] args) throws IOException {

        int n = 5;
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        List<Long> skillList = Arrays.stream(bf.readLine().split(" "))
                .map(value -> Long.parseLong(value))
                .collect(Collectors.toList());

        while (n-- > 0) {
            skillList.add(Long.parseLong(bf.readLine()));
        }

        System.out.println(skillList);

    }

}
