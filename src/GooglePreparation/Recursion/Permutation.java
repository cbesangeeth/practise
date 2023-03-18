package GooglePreparation.Recursion;

public class Permutation {

    public static void main(String[] args) {
        String input = "aaa";

        // abc acb
        // bca bac
        // cab cba

        permutation("", input);
        System.out.println(counter);
    }

    static int counter =0;
    static void permutation(String prefix, String str){
        if(str.length() == 0){
            counter++;
            System.out.println(prefix);
            return;
        } else{
            for(int i=0 ;i<str.length(); i++){
                permutation(prefix + String.valueOf(str.charAt(i)),
                        str.substring(0,i) + str.substring(i+1, str.length()));
            }
        }

    }
}
