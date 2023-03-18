package GooglePreparation.search;

public class LinearSearch {

    public static void main(String arg[]){

        int arr[] = {3,2,5,6,1};

        int search = 1;

        System.out.println(isFound(arr, search));
    }

    private static String isFound(int[] arr, int search) {
        for(int i = 0; i< arr.length; i++){
            System.out.println(arr[i]);
            if(arr[i] == search){
                return "FOUND";
            }
        }

        return "NOT FOUND";
    }
}
