package new_202503.day2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class 콜라츠_수열_만들기 {
    public static void main(String[] args) {
        int[] answer = {};
        int n = 10;
        List<Integer> list = new ArrayList<>();
        list.add(n);

        while(n > 1) {
            if ( n % 2 == 0) {
                n /= 2;
                list.add(n);
            } else {
                n = ( 3 * n ) + 1;
                list.add(n);
            }
        }
        answer = list.stream().mapToInt(i -> i).toArray();
        System.out.println(Arrays.toString(answer));

    }
}
