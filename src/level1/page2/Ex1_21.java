package level1.page2;

public class Ex1_21 {
    public static void main(String[] args) {
        String s = "123456";
        boolean answer = true;
        int a = 0;
        for(int i=0; i<s.length() ; i++) {
            if(!(s.charAt(i) >= '0' && s.charAt(i) <= '9')){
               a++;

            }
        }
        if(a==0 && (s.length()==4 || s.length()==6)) {
            answer = true;
        } else {
            answer = false;
        }
        System.out.println(answer);
    }
}
