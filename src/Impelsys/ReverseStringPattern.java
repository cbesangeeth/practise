package Impelsys;

public class ReverseStringPattern {

    public static void main(String a[]){

        String input= "Amazon";
//        input.chars().mapToObj();

        /**
         * Amazon
         * Amazo
         * Amaz
         * Ama
         * Am
         * A
         */
        for(int i=input.length(); i>0; i--){
            System.out.println(input.substring(0,i));
        }


        /**
         * A
         * Am
         * Ama
         * Amaz
         * Amazo
         * Amazon
         */
        for(int i=0; i<=input.length(); i++){
            System.out.println(input.substring(0,i));
        }
    }
}
