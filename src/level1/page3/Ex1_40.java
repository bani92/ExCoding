package level1.page3;

import java.math.BigInteger;

public class Ex1_40 {
    public static void main(String[] args) {
        String t = "3141592";
        String p = "271";
        String result = "";
        int answer = 0;

        // p.length 만큼 314 141 415 159 592
        // 횟수는 어떻게 정하지?

//        t.substring(0,3);
//        t.substring(1,4);
//        t.substring(2,5);
//        t.substring(3,6);
//        t.substring(4,7);
        // t.substring(i값은 t.length 7 - p.length 3 = 4까지 출력)
        // t.substring(i,j값은 t의 길이보다 크면 break)
        for(int i=0, j=p.length(); i<=t.length()-p.length() ; i++) {
            if(j>t.length()) {
                break;
            }
          //  System.out.println("i = " + i + " j = " + j);
            result = t.substring(i,j);
            System.out.println("result = " + result);
            j++;
            if(Long.parseLong(result) <= Long.parseLong(p)) {

                answer++;
            }

        }
        System.out.println(answer);
    }
}
