package level0;

import java.util.Arrays;

public class Ex1_8 {
    public static void main(String[] args) {
                 // {5,4,3,2,1}
                // {1,2,3,4,5}
        int arr[] = {1,2,3,4,5};
        int arr1[] = {};



        arr1 = new int[arr.length];

        for( int i=0; i<arr.length ; i++) {

            arr1[i] = arr[arr.length-i-1];

        }
//        for(int i=0; i< arr.length ; i++) {
//
//            arr[i] = arr1[arr1.length-k];
//
//            System.out.println(arr1[arr1.length-k]);
//            k++;
//
//        }
    }
}
