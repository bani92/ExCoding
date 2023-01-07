package level1;

public class Ex1_6 {
    public static void main(String[] args) {
        long x = 0;
        int n = 5;
        long y = x;
        long[] answer = {};
        answer = new long[n];

        for(int i=0; i<n ; i++) {
            answer[i] = x;
            x = x + y;
            System.out.println(answer[i]);
        }

    }
}
