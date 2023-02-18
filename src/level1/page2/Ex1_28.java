package level1.page2;

public class Ex1_28 {
    public static void main(String[] args) {
        String s = "Z";

        int n = 1;
        String an = "";
        for(int i=0 ; i<s.length() ;i++) {
            if(s.charAt(i)=='z' || s.charAt(i)=='Z') {
                int c =  s.charAt(i);
                c -= 25;
                char d = (char) c;
            }
           int c =  s.charAt(i);
            System.out.println("before:"+ c);
            c = c + n;
            System.out.println("after:"+c);
            char d = (char) c;
            System.out.println(d);
            an += d;
        }
        System.out.println(an);

        int x = s.charAt(0);
        x -= 25;
        System.out.println((char)x);
    }
}
