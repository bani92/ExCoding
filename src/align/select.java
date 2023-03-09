package align;

import java.util.Arrays;

public class select {
    public static void main(String[] args) {
        int[] select = {2,4,1,3,5,7,6};

        int index = 0;
        int tmp = 0;
        // 제일 작은 숫자를 선택
        // 맨 앞에 있는것과 비교해서 작으면 옮기기
    for(int j=0; j<select.length; j++) {
        int min = 999; // 1번 돌때마다 초기화
        for(int i=j; i<select.length ; i++) {

            if(min > select[i]) {
                min = select[i]; // min보다 크면 오른쪽 select[i]가 더 작기때문에 min 대입
                index = i; // 작은 부분 위치



            }
        }
        tmp = select[j]; // 한 바퀴 돌면 index값과 j 값을 통해 위치변경
        select[j] = select[index];
        select[index] = tmp;
    }

        System.out.println(Arrays.toString(select));
    }
}
