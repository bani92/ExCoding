package level1;

import java.util.Arrays;

public class Ex1_11 {
    public static void main(String[] args) {
        int[] arr = {2,36,1,3};
        int[] answer = {};
        int div = 1;
        int b = 0;
        for(int i=0; i<arr.length ;i++) {
            if(arr[i]%div==0) {

                b++;
            }
        }
        if(b!=0) {
            answer = new int[b];
        } else {
            answer = new int[1];
        }

        int a = 0;
        for(int i=0 ; i<arr.length; i++) {
            if(arr[i]%div==0) {
                answer[a] = arr[i];
                a++;
            } else if(a == 0) {
                answer[0] = -1;
            }
        }
        Arrays.sort(answer);



    }
}
