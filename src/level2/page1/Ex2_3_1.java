package level2.page1;

public class Ex2_3_1 {
    public static void main(String[] args) {
        String s = "3Pop   UNFOllow  me";
        String answer = "";

        String[] s1 = {""};
        char[] arr = new char[s.length()];

        for(int i=0; i<s.length() ; i++) {
                arr[i] = s.charAt(i);
            System.out.print(arr[i]);
        }

        // 첫글자인지 아닌지 어떻게 알지?
        // 맨처음글자는 알수있음(arr[0])
        // 문자다음 빈칸이 나오면 해당 문자를
        for(int i=0; i<s.length() ; i++) {

            if(arr[i]!=' ') {
                s1[0] += arr[i];
                System.out.println(s1[0]);
            }

        }

       // 3Pop을 어떻게 알지?






    }
}
