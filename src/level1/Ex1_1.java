package level1;

public class Ex1_1 {
    public static void main(String[] args) {
        int a = 987;

        // 숫자를 나누는방법
        // 1, 2, 3
        String d = "1";
        System.out.println(d.charAt(0));
        String b = String.valueOf(a);
        System.out.println(b);
        int c = 0;
        for(int i=0; i<b.length() ; i++) {

            c  += b.charAt(i) - 48;
            System.out.println(c);
        }
    }
}
