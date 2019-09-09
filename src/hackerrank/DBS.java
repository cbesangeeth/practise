package hackerrank;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.stream.Stream;

public class DBS {

    public static void main(String a[]){
        DBS dbs = new DBS();
        dbs.start();
        dbs.end();
        dbs.st();

        Stream.of(1,2,3,4,5).filter(m-> m>3).peek(System.out::println).findFirst().orElse(null);
    }

    void st(){
        String b = "hello";
        String m = fix(b);
        System.out.println(b+ " "+ m);
    }

    String fix(String m){
        m = m + "world";
        System.out.print(m + " ");
        return m;
    }
    public void end(){
        boolean a = true;
        boolean b = kai(a);

        System.out.println(b);
        System.out.println(b);


        System.out.println(20+1.4f+"a"+"b");

        String f = "hello";
        String g = new String(f);
        String h = "HELLO";
        System.out.println(f.equals(g));
        System.out.println(f==h);
        System.out.println(g.equals(h));
    }

    boolean kai(boolean a){
        a= false;
        return a;
    }

   public void start(){
        long a[] = {10, 1,2};
        long b[] = hai(a);
       for (long l : a) {
           System.out.println(l);
       }
       for (long l : b) {
           System.out.println(l);
       }
    }

    long[] hai(long[] b){
        b[0] = 0 ;
        return b;
    }

}
