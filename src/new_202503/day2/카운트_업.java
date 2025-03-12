package new_202503.day2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class 카운트_업 {
    public static void main(String[] args) {
        int start_num = 3;
        int end_num = 10;
        int[] answer = {};
        List<Integer> list = new ArrayList<>();

        for(int i = start_num; i <= end_num; i++) {
            list.add(i);
        }
        answer = list.stream().mapToInt(i -> i).toArray();
        System.out.println(Arrays.toString(answer));
    }
}
