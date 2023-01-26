package level1.page2;

public class Ex1_17 {
    public static void main(String[] args) {
        int n = 3;
        String answer = "";

        if(n==1) {
            answer = "수";
        } else if(n==2) {
            answer = "수박";
        } else if(n==3) {
            answer = "수박수";
        }

        // n = 1이면 수
        // n = 2이면 수박
        for(int i=0; i<n; i++) {
            answer += "수";

        }
    }
}
