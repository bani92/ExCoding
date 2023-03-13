package level1.page3;

import etc.Solution;

public class Ex1_43 {
    static boolean isPrimeNumber(int x) { // 에라토스테네스의 체
        int end = (int)Math.sqrt(x); // 제곱근을 이용
        System.out.println("end = " + end);
        for(int i=2; i<=end ; i++) {
            System.out.println("x의 값 = " + x);
            System.out.println("i의 값 = " + i);
            if(x % i == 0) {
                System.out.println("false");
                return false;
            }
        }
        System.out.println("true야??");
        return true;
    }
    public static void main(String[] args) {
        int answer = 0;
        int n = 100;

        for(int i=2; i <= n ; i++) {
            System.out.println("i = " + i);
            if(isPrimeNumber(i)) {
                answer++;
                System.out.println("answer = " + answer);
            }
        }



        // 기존 소수 찾기 코드
        //        int n = 100;
//        int result = 0;
//        int answer = 0;
//        for(int i=2 ; i<=n ; i++) {
//            int x = 0;
//            for(int j=1; j<=n ; j++){
//                if(i%j==0) {
//                    x++;
//                }
//                if(i==j) {
//                    break;
//                }
//            }
//            if(x==2) {
//                result++;
//            }
//        }
//        System.out.println(result);



    }
}
