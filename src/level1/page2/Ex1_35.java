package level1.page2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Ex1_35 {
    public static void main(String[] args) {
        String[] strings = {"abde","abcd","abcg"};
        int n = 2;

        List<String> s1 = new ArrayList<>(strings.length);
        String[] answer = new String[strings.length];

        for(int i=0; i<strings.length ; i++) {
            s1.add(String.valueOf(strings[i].charAt(n) + strings[i]));
        }
        Collections.sort(s1);
        System.out.println(s1);


        for(int i=0; i< strings.length ; i++) {
            answer[i] = s1.get(i).substring(1);
        }

        System.out.println(answer[0]);
        System.out.println(answer[1]);
        System.out.println(answer[2]);


            }


    }

// 두 수를 비교해서 작은거를 왼쪽에 둔다.
//큰 수를 오른쪽에 둔다.
//for문 한바퀴
//
//
//c , c , x 를
//strings 3개의 문자와 각각 비교해서
//같으면 새로 배열 answer 에다가 넣어야함
//
//abce abcd cdx
//
//
//
//처음엔 같으면
//
//answer[0]에 abce 들어감
//abcd도 c 이기때문에 answer[0] 들어가야함
//
//근데 이제 e와 d를 비교해서 작은수를 왼쪽 넣는다
//큰 수를 오른쪽에 넣는다 즉 연속된 숫자이기에
//
//answer[1] 이 되었을때 abce 를 넣고
//answer[1].equals(abce) 같으면 continue?