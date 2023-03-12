package backjoon;

import java.util.Scanner;

public class E_2750 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int s = sc.nextInt();
        int max = 999;
        int[] arr = new int[s];

        for(int i=0; i<s ; i++) {
            arr[i] = sc.nextInt();
        }

        for(int i=0; i<s-1 ; i++) {
            for(int j=i+1; j<s; j++) {
                if(arr[i] > arr[j]) {
                    int temp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = temp;
                }
            }

        }

        for(int val : arr) {
            System.out.println(val);
        }

    }
}
