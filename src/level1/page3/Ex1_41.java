package level1.page3;

public class Ex1_41 {
    public static void main(String[] args) {
        int a = 2;
        int b = 1;
        int n = 20;
        int answer = 0;


        while(n/a > 0) {
            answer += n/a*b;
          n =  n - (a * (n/a)) + n/a * b;
            System.out.println("n의 값 : " + n);


        }

        System.out.println(answer);
    }
}
