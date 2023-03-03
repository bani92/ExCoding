package level1.page3;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Ex1_39 {
    public static void main(String[] args) {
        int[] numbers = {5,0,2,7};
        int[] answer = {};

        Set<Integer> set = new HashSet<>();

        for(int i=0; i<numbers.length ; i++) {
            for(int j=i+1; j< numbers.length ; j++) {
             set.add(numbers[i] + numbers[j]);

            }
        }
        answer = new int[set.size()];
       Integer[] array = set.toArray(new Integer[set.size()]);
        for(int i=0; i<set.size() ; i++) {
            answer[i] = array[i];
        }
     //   System.out.println(Arrays.toString(array));
        System.out.println(array[0]);
        System.out.println(set.size());

    }
}
