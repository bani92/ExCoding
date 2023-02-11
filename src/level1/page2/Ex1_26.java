package level1.page2;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class Ex1_26 {
    public static void main(String[] args) {
        int[] arr = {1,1,3,3,0,1,1};
        int[] answer = {};
        int a = -1;
        ArrayList list = new ArrayList();


        for(int i=0; i<arr.length; i++) {
            if(a!=arr[i]) {
                list.add(arr[i]);
                a = arr[i];
            }

        }
        System.out.println(list);
      answer = new int[list.size()];
      for(int i=0; i<list.size(); i++) {
          answer[i] = (int) list.get(i);
          System.out.println(answer[i]);
      }



    }
}
