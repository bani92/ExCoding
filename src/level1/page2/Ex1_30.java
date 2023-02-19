package level1.page2;

import java.util.Arrays;

public class Ex1_30 {
    public static void main(String[] args) {
        int[] d = {1,3,2,5,4};
        int budget = 9;
        int result = 0;
        int a = 0;
        Arrays.sort(d);
        for(int i=0 ;i<d.length ; i++) {

            result += d[i];
            if(result > budget) {
                a = i;
                break;
            }
        }
        if(result <= budget) {
            a = d.length;
        }
        System.out.println(a);
    }
}
