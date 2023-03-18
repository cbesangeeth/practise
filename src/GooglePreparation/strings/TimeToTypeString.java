package GooglePreparation.strings;

//https://leetcode.com/discuss/interview-question/356477
public class TimeToTypeString {

    public static void main(String[] args) {
        String input = "cba";

        int sum = 0;
        int index = 'a';
        for(int i=0 ; i<input.length(); i++){
            sum += Math.abs(input.charAt(i) - index);
            index = input.charAt(i);
        }
        System.out.println(sum);
    }
}
