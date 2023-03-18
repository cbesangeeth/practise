package GooglePreparation.Greedy;

//https://www.hackerrank.com/challenges/hackerland-radio-transmitters
public class RadioTransmission {

    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5};
        int k = 1;
        int n = arr.length;

        int i=0;
        while(i<n){
            int loc = arr[i] + k;
            while(i<n && arr[i]<=loc){
                i++;
            }
            System.out.println(arr[i-1]);
//            i++;
        }
    }
}
