package level1.page2;

public class Ex1_20 {
    public static void main(String[] args) {
        int a = 13;
        int b = 17;
        int c = 0;
        // 13 14 15 16 17
        // 1 13 , 1 2 7 14 , 1 3 5 15 , 1 2 4 8 16 , 1 17

        for(int i= a ; i<= b; i++) {

            for(int j = 1 ; j <= a ; j++) {
                System.out.println(a);
                if(a % j == 0) {
                    System.out.print(j + " ");
                }
            }
            System.out.println();

        }
        // 13의 약수 구하기


    }
}
