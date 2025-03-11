package new_202503;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class 문자열뒤의n글자 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String my_string = br.readLine();
        int n = Integer.parseInt(br.readLine());
        System.out.println(my_string.substring(my_string.length() - n));
    }
}
