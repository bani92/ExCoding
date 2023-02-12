package level1.page2;

import java.util.ArrayList;

public class Ex1_27 {
    public static void main(String[] args) {

        int n = 125;
        int answer = 0;
        ArrayList<Integer> list = new ArrayList<>();
        for(int i=0; ; i++) {
             list.add(n % 3);
           n = n / 3;
            System.out.println(list);
           if(n==0) {
               break;
           }

        }

        for(int j=list.size()-1, z=0; j>=0 ; j--) {
            int i = z == 0 ? list.get(j) : (int) (list.get(j) * Math.pow(3, z));

            answer += i;
            z++;
            System.out.println(answer);

        }
//        while(n>=0) {
//            n /= 3;
//            if(n==0) {
//                break;
//            }
//            System.out.println(n);
//        }
    }
}
