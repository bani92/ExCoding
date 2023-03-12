package level1.page3;

public class Ex1_42 {
    public static void main(String[] args) {
        // 푸드 파이터 대회
        int[] food = {1,3,4,6};
        String answer = "0";

        // for문을 2번써서
        // 처음 쓸때는 0전까지
        // 두번 쓸때는 0후부터
        for (int i = food.length - 1; i > 0; i--) {
            for (int j = 0; j < food[i] / 2; j++) {
                answer = i + answer + i;
            }
        }




//        for(int i=1; i< food.length ; i++) {
//            // i라는 숫자를 몇번 반복?
//            // 3일때는 1번
//            // 4일때는 2번
//            // 6일때는 3번
//            int num = food[i]/2;
//            while(num>0) {
//                answer += i;
//                num--;
//            }
//        }
//        answer += 0;
//        for(int i= food.length-1; i>0 ; i--) {
//            // i라는 숫자를 몇번 반복?
//            // 3일때는 1번
//            // 4일때는 2번
//            // 6일때는 3번
//            int num = food[i]/2;
//            while(num>0) {
//                answer += i;
//                num--;
//            }
//        }
        System.out.println(answer);
    }
}
