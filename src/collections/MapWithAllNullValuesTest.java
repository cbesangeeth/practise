package collections;

import java.util.HashMap;
import java.util.Map;

public class MapWithAllNullValuesTest {

    public static void main(String args[]){

        Map<String,String> myMap = new HashMap<>();

        myMap.put("1", null);
        myMap.put("2", null);

        System.out.println(myMap);

    }
}
