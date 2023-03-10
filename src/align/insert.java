package align;

import java.util.Arrays;

public class insert {
    public static void main(String[] args) {
        // 왼쪽에 있게되면 대부분 정렬되어있다고 봄
        // 정렬이 어느정도 된 배열은 삽입정렬이 효율성이 제일 높음
        int[] array = {2,4,1,3,5,7,6};
        int temp = 0;
        for(int i=0; i<array.length-1; i++) {
            int j = i;

            while(array[j] > array[j+1]) {
                temp = array[j];
                array[j] = array[j+1];
                array[j+1] = temp;
                j--;
                if(j==-1) {
                    break;
                }
            }
        }
        System.out.println(Arrays.toString(array));
    }
}
