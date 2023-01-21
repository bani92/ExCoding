package level2.page1;

public class Ex2_3_1 {
    public static void main(String[] args) {
        String s = "aaaaa     aaa ";
        s = s.toLowerCase();
        String answer = "";
        System.out.println(s);
        String a[] = new String[s.length()];

        // String 배열로 만들고 배열에 한 글자씩 담기
        // 문자
        for(int i=0; i<s.length() ; i++) {
            a[i] = String.valueOf(s.charAt(i));

        }
        System.out.println(s.length());
        for(int i=0; i<s.length() ; i++) {
            if(a[i].equals(" ")) {
                a[i+1] = a[i+1].toUpperCase();
            } else if(s.charAt(0) >= 'a' && s.charAt(0) <= 'z') {
                a[0] = a[0].toUpperCase();
            } else if(a[i].equals(" ") && a[s.length()].equals(" ")) {

            }

        }


        for(int i=0 ;i<s.length() ;i++) {
           answer += a[i];
        }
        System.out.println(answer);








    }
}
