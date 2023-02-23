package level1.page2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Ex1_34 {
    public static void main(String[] args) {
        String[] strings = {"abcd","abce","cdx"};
        int n = 2;
       // char[] s = new char[strings.length];
        List<String> s1 = new ArrayList<>(strings.length);
        String[] answer = new String[strings.length];
        // for문으로 charat을 이용하여 해당 인덱스 글자를
        // 하나씩 들고와서 그걸 어디다가? String 배열에다가 넣을까?

        // 알파벳을 하나씩 추출해서 sort 한 다음
        // 알파벳과 charAt이 같은걸 배열에 넣자
        for(int i=0; i<strings.length ; i++) {
            s1.add(String.valueOf(strings[i].charAt(n)));
        }
        Collections.sort(s1);


//        // 배열과 한번씩 비교
//        s1.get(0); strings[0] , [1] , [2]
//        s1.get(1);
//        s1.get(2);
//        System.out.println(strings[0].substring(1, 1));

        for(int i=0; i<strings.length ;i++) {
            for(int j=0; j< strings.length ; j++) {
                if(String.valueOf(strings[j].charAt(n)).equals(s1.get(i))) {
                 answer[i]  = strings[j];
                    System.out.println(answer[i]);
                }
            } // 안쪽 for문
        } // 바깥쪽 for문

    }
}
