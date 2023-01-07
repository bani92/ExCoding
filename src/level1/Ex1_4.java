package level1;

public class Ex1_4 {
    public static void main(String[] args) {
        // 제곱의 숫자 구하기
        long n = 121;

        // 11 * 11 = 121
        // a * a  = 121
        for(int i =0; i<n ; i++) {
            if((long) i * i==n) {
                System.out.println((i+1)*(i+1));
                break;
            } else {
                System.out.println(-1);

            }




        }
    }
}
