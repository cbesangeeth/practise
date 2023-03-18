package GooglePreparation;

import java.util.Arrays;

public class MergeSort {

    public static void main(String arg[]){

        int[] array = {4,53,4,1,8,3};
        mergeSort(array, 0, array.length-1);
        System.out.println(Arrays.toString(array));

    }

    static void sort(int[] array, int left, int mid, int right){
        System.out.println("left:"+ left + "right:"+ right +"mid:"+ mid);

        int n1 = mid - left + 1;
        int n2 = right - mid;

        int L[] = new int[n1];
        int R[] = new int[n2];

        for(int i=0 ;i<n1;++i){
            L[i] = array[left+ i];
        }
        for(int i=0 ;i<n2;++i){
            R[i] = array[mid + 1 + i];
        }

        int i=0,j=0,k=left;

        while(i<n1 && j<n2){
            if(L[i] <=R[j]){
                array[k] = L[i];
                i++;
            } else {
                array[k] = R[j];
                j++;
            }
            k++;

        }

        while (i < n1) {
            array[k] = L[i];
            i++;
            k++;
        }

        /* Copy remaining elements of R[] if any */
        while (j < n2) {
            array[k] = R[j];
            j++;
            k++;
        }

    }

    static int[] mergeSort(int[] array, int left, int right){

        if(left < right) {
            int mid = left + (right-left) / 2;
            mergeSort(array, left, mid);
            mergeSort(array, mid + 1, right);
            sort(array, left, mid, right);

        }


//        System.out.println(left + ":" + array[left]);
//        System.out.println(right + " :" +array[right]);
//
        return array;
    }
}
