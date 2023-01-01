package level0;

public class Ex1_10 {
    public static void main(String[] args) {

        int n = 15;
        int answer = 0;

        // n이 1~7이면 answer 1
        // n이 8~14 answer 2
        // n이 15~27 answer 3

        // 피자 한판 7조각
        answer = ((n-1)/7)+1;
        System.out.println(answer);

    }
}
