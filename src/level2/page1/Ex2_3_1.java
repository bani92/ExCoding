package level2.page1;

public class Ex2_3_1 {
    public static void main(String[] args) {
        String s = "aaaaa     aaa   ";
        s = s.toLowerCase();
        String answer = "";
        System.out.println(s);
        String[] a = new String[s.length()];

        // String 배열로 만들고 배열에 한 글자씩 담기
        // 문자
        for(int i=0; i<s.length() ; i++) {
            a[i] = String.valueOf(s.charAt(i));

        }


        for(int i=0; i<s.length() ; i++) {
            // 자리가 빈칸이고 i가 마지막숫자가 아니면 대문자로
            // 자리가 빈칸이고 i가 마지막숫자이면 break;
            if(a[i].equals(" "))
            {
                if(i!=s.length()-1) {
                    a[i+1] = a[i+1].toUpperCase();
                }

            } else if(s.charAt(0) >= 'a' && s.charAt(0) <= 'z') {
                a[0] = a[0].toUpperCase();
            }

        }


        for(int i=0 ;i<s.length() ;i++) {
           answer += a[i];
        }
        System.out.println(answer);








    }
}
