package align;

import java.util.Arrays;

public class quick {

    static void quickSort(int[] data, int start , int end) {
        if(start >= end) { // 원소가 1개인 경우 그대로 두기
            return;
        }
        int key = start;
        int i = start + 1;
        int j = end;

        while(i <= j) {
            while(i <= end && data[i] <= data[key]) {
                i++;
            }
            while(j > start && data[j] >= data[key]) {
                j--;
            }
            if(i > j) {
                int temp = data[j];
                data[j] = data[key];
                data[key] = temp;
            } else {
                int temp = data[i];
                data[i] = data[j];
                data[j] = temp;
            }
        }
        quickSort(data, start , j -1);
        quickSort(data , j + 1, end);
    }
    public static void main(String[] args) {

        int[] array = {2,4,1,3,5,7,6};
        quickSort(array,0, array.length-1);
        System.out.println(Arrays.toString(array));
    }
}
