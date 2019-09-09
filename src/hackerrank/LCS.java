package hackerrank;


import java.io.BufferedReader;
        import java.io.InputStreamReader;
import java.util.Collections;
import java.util.HashMap;

//import for Scanner and other utility classes



// Warning: Printing unwanted or ill-formatted data to output will cause the test cases to fail

class LCS implements Runnable{
    public static HashMap<String, Integer> map = new HashMap<>();

    public static void main(String args[] ) throws Exception {
        String str1 ="abcba";             // Reading input from STDIN
        String str2 = "acab";

        System.out.println(calculate(str1,str2));
    }

        private static long calculate (String str1, String str2){

            for(long i=0; i<str1.length(); i++){
                String  s =  str1.substring((int)i, str1.length());
                Thread t = new Thread(new Runnable() {
                    @Override
                    public void run() {
                        find(s,str2);
                    }
                });

               t.start();

            }

            long length = 0 ;

            if (map.size()>0){
                length = Collections.max(map.values());
            }

            return length;
        }

        private static void find(String str1, String str2){
            String s ;
            for(long i = 1; i<=str1.length() ; i++){
                 s = str1.substring(0,(int)i);

                if(map.get(s)!=null){
                    continue;
                }

                if(str2.indexOf(s)==-1){
                    break;
                }
                map.put(s, s.length());
            }


        }

    @Override
    public void run() {

    }
}
