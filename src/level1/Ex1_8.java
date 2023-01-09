package level1;

public class Ex1_8 {
    public static void main(String[] args) {
        int a = 3;
        int b = 5;
        long answer = 0;
        if(a>b) {
           for(int i=b; i<=a ; i++) {
               answer += i;
           }
        } else if(a<b) {
            for(int i=a; i<=b ; i++) {
                answer += i;
            }
        } else {
            answer = a;
        }

    }
}
