package org.codesimple.backtrack;

import javax.xml.stream.events.Characters;

public class kThChar {

    public static void main(String[] args) {
        int k = 10;
        StringBuilder word = new StringBuilder("a");

        String result = backtrack(k, word);
        System.out.println(result);
        System.out.println(result.charAt(k-1));
    }

    public static String backtrack(int k, StringBuilder word){
        if(word.length() >= k){
            return word.toString();
        }

        word.append(oper(word));
//        for(char eachChar: word.toString().toCharArray()){
//            return backtrack(k, word.append((char)(eachChar + 1)));
//        }

        return backtrack(k, word);
    }

    public static String oper(StringBuilder word){
        String result = "";
        for(char eachChar: word.toString().toCharArray()){
            result = result + (char)(eachChar+1);
        }

        return result;
    }
}
