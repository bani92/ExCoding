package level1.page2;

import java.util.Arrays;
import java.util.Collections;

public class Ex1_19 {
    public static void main(String[] args) {
        String s = "Zbcdefg";
        String answer = "";
        int[] a= new int[s.length()];

        for(int i=0; i<s.length() ; i++) {
           a[i] =  s.charAt(i);

        }
        Arrays.sort(a);
        for(int i=s.length()-1; i>=0 ; i--) {

           char c = (char) a[i];
           answer += c;
        }

        System.out.println(answer);
    }
}
