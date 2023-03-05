package level1.page3;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Ex1_39 {
    public static void main(String[] args) {
        int[] numbers = {2,1,3,4,1};
        int[] answer = {};

        Set<Integer> set = new HashSet<>();

        for(int i=0; i<numbers.length ; i++) {
            for(int j=i+1; j< numbers.length ; j++) { // 2 + 1,3,4,1    1 + 3,4,1    3 + 4,1   4+1
             set.add(numbers[i] + numbers[j]); // Hashset에 담으면 순서 정렬 및 중복 제거

            }
        }

        answer = new int[set.size()];
       // Integer[] array = set.toArray(new Integer[set.size()]);
        Object[] array = set.toArray();
        for(int i=0; i<set.size() ; i++) {
            answer[i] = (int) array[i]; // 형변환 해도 되고 안할꺼면 Integer array로 위에같이 진행
        }
       System.out.println(Arrays.toString(answer));



    }
}
