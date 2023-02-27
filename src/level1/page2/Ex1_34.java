package level1.page2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Ex1_34 {
    public static void main(String[] args) {
        String[] strings = {"abce","abcd","abcg"};
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
//        s1.get(1); strings[0] , [1] , [2]
//        s1.get(2); strings[0] , [1] , [2]
//        System.out.println(strings[0].substring(1, 1));
        System.out.println(s1);
        for(int i=0; i<strings.length ;i++) {
            for(int j=0; j< strings.length ; j++) {
                if(String.valueOf(strings[j].charAt(n)).equals(s1.get(i))) { // 배열안의 문장에 1자릿수를 비교하여 맞으면 answer[i] 에 담김
                    // 같으니깐 여기로 들어왔지

                    // 조건을 뭐라고 걸지?


                    System.out.print("get(i) = " + i);
                    System.out.print(" j = " + j);
                    System.out.print(" "+strings[j]);
                    System.out.println();

                        if(answer[i]!=null && (answer[i].substring(0,n)).equals(strings[j].substring(0,n)) && (!answer[i].equals(strings[j]))) {
                            // 널이 아니면 안에 있는 answer 값과 string 값을 비교?
                            System.out.println("answer의 값 " +answer[i]);
                            System.out.println("strings 값 " +strings[j]);
                            System.out.println("answer n+1 " + answer[i].charAt(n+1));
                            System.out.println("strings n+1 " + strings[j].charAt(n+1));

                            if(answer[i].charAt(n+1)>strings[j].charAt(n+1)) {



                                   // answer[i+1] = answer[i];
                                    answer[i]  = strings[j];
                                    i++;
                            }

                        } else {
                            // 널이면 값을 넣고
                            answer[i]  = strings[j];
                        }


                    System.out.println();
                   // System.out.println(answer[i]);

                    // 정렬하면 1,2  , 2 3 , 1 2 3
                    // int a = 0; a = 2가 되면
                }
            } // 안쪽 for문
        } // 바깥쪽 for문

        System.out.println(answer[0]);
        System.out.println(answer[1]);
        System.out.println(answer[2]);
    }
}
