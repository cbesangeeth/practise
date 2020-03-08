package ninjacart;

import java.util.HashMap;

public class SameString {

    public static void main(String arg[]) {

        String str1 = "abc";
        String str2 = "bca";

        if (str1.length() == str2.length()) {

            HashMap<Character, Long> map = new HashMap<>();

            String both = str1.concat(str2);

            for (int i = 0; i < both.length(); i++) {
                Character key = both.charAt(i);

                if (map.containsKey(key)) {
                    Long value = map.get(key) + 1;
                    map.put(key, value++);
                } else {
                    map.put(key, 1l);
                }
            }

            long count = map.entrySet().stream().filter(each -> each.getValue()!=2).count();

            if(count>0){
                System.out.println("NO");
            } else
            {
                System.out.println("YES");
            }

        } else {
            System.out.println("NO");
        }
    }
}
