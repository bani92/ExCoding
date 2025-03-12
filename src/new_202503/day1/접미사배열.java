package new_202503.day1;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class 접미사배열 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String my_string = br.readLine();
        String[] answer = new String[my_string.length()];

        for(int i=0; i<my_string.length(); i++) {
            answer[i] = my_string.substring(i, my_string.length());
        }

        Arrays.sort(answer);

        System.out.println(Arrays.toString(answer));
    }
}
