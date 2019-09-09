package strings;

public class LiteralVsNew {

    public static void main (String[] arg) {
        String s1 = "hello";
        String s2 = new String("hello");
        String s3 = "hello";

        System.out.println(s1.hashCode());
        System.out.println(s2.hashCode());
        System.out.println(s3.hashCode());

        System.out.println(s1==s2);
        System.out.println(s1.equals(s2));

        System.out.println(s1==s3);
        System.out.println(s1.equals(s3));

    }
}
