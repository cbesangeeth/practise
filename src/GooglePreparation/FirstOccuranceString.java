package GooglePreparation;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;

public class FirstOccuranceString {
    public static void main(String[] args) {
        String input = "bcaba";
        String nonRec = "bcaba";
        getRecurringChar(input);
        getFristNonRecurringChar(nonRec);
    }

    static void getRecurringChar(String input){
        HashMap<Character, Integer> map = new HashMap<>();
        Hashtable<Character, Integer> ht = new Hashtable();

        for(int i=0; i<input.length() ; i++){
            char key = input.charAt(i);
            if(map.containsKey(key)){
                System.out.println(key);
                return;
            } else{
                map.put(key, 1);
            }
        }
        System.out.println("None");
    }

    static void getFristNonRecurringChar(String input){

        HashMap<Character, Integer> map = new HashMap<>();
        for(int i=0; i<input.length() ; i++){
            char key = input.charAt(i);
            if(map.containsKey(key)){
                int value = map.get(key);
                value++;
                map.put(key, value);

            } else{
                map.put(key, 1);
            }
        }

        for (Map.Entry<Character, Integer> characterIntegerEntry : map.entrySet()) {
            if(characterIntegerEntry.getValue() == 1){
                System.out.println(characterIntegerEntry.getKey());
                break;
            }
        }

    }
}
