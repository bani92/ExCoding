package level2.page1;

public class Ex2_4 {
    public static void main(String[] args) {
        int[] A = {1,2};
        int[] B = {3,4};

        int c = -1;
        int d = -1;
        int ran1 = 0;
        int ran2 = 0;
        int random = 0;
        // 경우의수
        // 1 * 3 , 1 * 4
        // 2 * 4 , 2 * 3
        //  11   ,   10

        //1. 랜덤으로 숫자뽑아서 중복안되게 나오게하기
        // 랜덤한 숫자를 변수에 담아서 그 변수가 그 전의 변수랑 같지않으면



        while(random < A.length) {
            int c1 = (int)(Math.random()*A.length);
            int d1 = (int)(Math.random()*A.length);
            // 1 0
            // 1 1
            System.out.println("c1 = " + c1);
            System.out.println("d1 = " + d1);
            if(c!=c1 && d!=d1) {
                c = c1;
                d = d1;
                ran1 += A[c] * B[d];
                System.out.println("합 = "+ ran1);
                random++;
            }



        }



//        if(c!=c1) {
//            c = c1;
//
//            System.out.println("다름 " +A[c]);
//        } else {
//            System.out.println(A[c]);
//        }
//        ran1 = A[c] + B[d];


    }
}
