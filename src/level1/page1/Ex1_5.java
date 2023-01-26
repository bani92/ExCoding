package level1.page1;

public class Ex1_5 {
    public static void main(String[] args) {

        String s = "pPoooyY";
        boolean answer = true;
        int p = 0;
        int y = 0;
        for(int i=0; i<s.length() ;i++) {
            if(s.charAt(i)=='p' || s.charAt(i)=='P') {
                p++;

            } else if(s.charAt(i)=='y' || s.charAt(i)=='Y') {
                y++;

            }
        }
        if(p==y) {
            answer=true;
        } else {
            answer = false;
        }
    }

}
