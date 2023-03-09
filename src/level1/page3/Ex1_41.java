package level1.page3;

public class Ex1_41 {
    public static void main(String[] args) {
        int a = 2;
        int b = 1;
        int n = 20;
        int answer = 0;


        while(n > a) {
            answer += n/a;
          n =  n - (a * (n/a)) + n/a;
            System.out.println(n);
            if(n==5) {
                answer += 1;
            }

        }

        System.out.println(answer);
    }
}
