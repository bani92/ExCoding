package level1.page1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Ex1_13 {
    public static void main(String[] args) {
        int[] arr = {4,10,1,5,3,2};
        int[] answer = {};

       int min = arr[0];

       if(arr.length==1) {
           answer = new int[1];
           answer[0] = -1;
       } else {
           answer = new int[arr.length-1];
       }
        for(int i=0; i<arr.length ; i++) {
            if(arr[i] < min) {
                min = arr[i];
            }
        }
        int j = 0;
        for(int i=0; i<arr.length ; i++) {

            if(arr[i]!=min) {
              answer[j] = arr[i];
              j++;

            }

        }
        for(int i=0; i<answer.length ; i++) {
            System.out.print(answer[i]);
        }








    }
}
