package GooglePreparation;

public class FindSubSequence {
    public static void main(String arg[]){

        String str1= "1codecaaocvdbe1";
        String str2 = "code1";

        boolean result = isSubsequence(str1, str2);
        System.out.println(result);
    }

    public static boolean isSubsequence(String str1, String str2){

        int j = 0;
        for(int i=0; i<str1.length() ; i++){

            if(str2.charAt(j) == str1.charAt(i)){
                j++;
            }
            if(j == str2.length()){
                return true;
            }
        }

        System.out.println("j : "+j);
        return false;
    }
}
