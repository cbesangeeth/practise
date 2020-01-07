package thoughtworks;

//https://www.hackerearth.com/practice/basic-programming/implementation/basics-of-implementation/practice-problems/algorithm/the-best-internet-browser-3/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BestInternetBrowser {

    static String removeVowel(String originalString){
        return originalString.replaceAll("[aeiouAEIOU]", "");
    }

    public static void main(String...args) throws IOException {

        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        int t = Integer.parseInt(bf.readLine());

        while(t--> 0){
            String url = bf.readLine();
            String[] splitedUrl = url.split("\\.");
            String replacedUrl = removeVowel(splitedUrl[1]);
            System.out.println(replacedUrl.length() + splitedUrl[2].length() + 1 + "/" + url.length());
        }
    }
}
