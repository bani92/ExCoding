package level1.page2;

public class Ex1_28 {
    public static void main(String[] args) {
        String s = "z";
        int n = 1;
        String an = "";
        for(int i=0 ; i<s.length() ;i++) {
           int c =  s.charAt(i);
            System.out.println("before:"+ c);
            c = c + n;
            System.out.println("after:"+c);
            char d = (char) c;
            System.out.println(d);
            an += d;
        }
        System.out.println(an);

    }
}
