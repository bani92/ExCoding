package level1.page2;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class Ex1_26 {
    public static void main(String[] args) {
        int[] arr = {1,1,3,3,0,1,1};
        int[] answer;

        ArrayList arrayStatck = new ArrayList();

        arrayStatck.add(arr[0]);
        System.out.println(arrayStatck.get(0));
        for(int i=1; i<arr.length ; i++) {
            while(arrayStatck.get(i-1)==null) {
                i--;

            }
            int a = (int) arrayStatck.get(i-1);
            System.out.println(a);
            if(a!=arr[i]) {
               arrayStatck.add(arr[i]);
            }
        }


        System.out.println(arrayStatck);



    }
}
