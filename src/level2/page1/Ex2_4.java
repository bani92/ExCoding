package level2.page1;

public class Ex2_4 {
    public static void main(String[] args) {
        int[] A = {1,2};
        int[] B = {3,4};
        int[] C = {1,2,3,4,5};
        int c = 0;
        int d = 0;
        int ran1 = 0;
        int ran2 = 0;
        int random = 0;
        // 경우의수
        // 1 * 3 , 1 * 4
        // 2 * 4 , 2 * 3
        //  11   ,   10

        //1. 랜덤으로 숫자뽑아서 중복안되게 나오게하기
        // 랜덤한 숫자를 변수에 담아서 그 변수가 그 전의 변수랑 같지않으면

        for(int i=0; i<C.length ; i++) {
            // 변수에 담고


            ran1 = (int)(Math.random()*C.length);

            for(int j=0; j<C.length ;j++) {
                if(C[ran1]==C[j]) {
                    i--;
                }
            }

            for(int k=0; k<C.length ; k++) {
                System.out.print(C[k]);
            }


        }


    }
}
