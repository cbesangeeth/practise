package GooglePreparation;


//Given an array of distinct elements. The task is to find triplets in the array whose sum is zero.
//
//        Examples :
//
//        Input : arr[] = {0, -1, 2, -3, 1}
//        Output : (0 -1 1), (2 -3 1)
//
//        Explanation : The triplets with zero sum are
//        0 + -1 + 1 = 0 and 2 + -3 + 1 = 0
//
//        Input : arr[] = {1, -2, 1, 0, 5}
//        Output : 1 -2  1
//        Explanation : The triplets with zero sum is
//        1 + -2 + 1 = 0
public class Tripets {

    public static void main(String[] args) {
        int arr[] = {0, -1, 2, -3, 1};

int sum =0;
        for (int i=0; i<arr.length -2; i++){
            for(int j =i+1 ; j< arr.length-1 ; j++) {
                for (int k = j + 1; k < arr.length; k++) {
                    sum = sum +1;
                    System.out.println(arr[i] +" " + arr[j] + " "+ arr[k]);
//                    if (arr[i] + arr[j] + arr[k] == 0) {
//                        System.out.print(arr[i]);
//                        System.out.print(" ");
//                        System.out.print(arr[j]);
//                        System.out.print(" ");
//                        System.out.print(arr[k]);
//                        System.out.print("\n");
//                    }
                }
            }
        }

        System.out.println(sum);

    }
}


