package techgig;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Villan {

    public static void main(String arg[]) throws IOException {
        BufferedReader bf= new BufferedReader(new InputStreamReader(System.in));

        int t= Integer.parseInt(bf.readLine());

        while(t-- >0){
            int n= Integer.parseInt(bf.readLine());
            //int villan[] = new int[n];
            List<Integer> v = new ArrayList<>();
            List<Integer> p = new ArrayList<>();

            String[] villan = bf.readLine().split(" ");
            String[] player = bf.readLine().split(" ");

            for(int i=0 ;i<n; i++){
                v.add(Integer.parseInt(villan[i]));
                p.add(Integer.parseInt(player[i]));
            }

            Collections.sort(v);
            Collections.sort(p);

            Boolean result = true;
            for(int i=0 ; i<v.size() ; i++){
                if(v.get(i)<p.get(i)){
                    continue;
                }else{
                    result =false;
                    break;
                }
            }

            if(result) System.out.println("WIN");
            else System.out.println("LOSE");

        }

    }
}
