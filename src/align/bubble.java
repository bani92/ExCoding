package align;

import java.util.Arrays;

public class bubble {
    public static void main(String[] args) {
        // 제일 느린 정렬 - 바로 옆하고 비교를 계속 해야함
        int[] array = {2,4,1,3,5,7,6};
        int temp = 0;
            // 제일 큰 수가 맨 뒤에 정렬됨
            // 그래서 j < array.length-1-i
        for(int i=0; i<array.length ; i++) {
            for(int j=0 ; j<array.length-1-i; j++) {
                System.out.println("i = " + i + " j = " +j);
                if(array[j]>array[j+1]) {
                    temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(array));
    }
}
