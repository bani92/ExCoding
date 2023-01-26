package level1.page1;

public class Ex1_15 {
    public static void main(String[] args) {
        int[] numbers = {1,2,3,4,6,7,8,0};
        // 5 , 9 가 없음

        int answer = 0;
        for(int i=0; i<10 ; i++) {
            int a = 0;
            for(int j=0 ; j<numbers.length;j++) {

                if(i==numbers[j]) {
                    a++;

                }
            }

            if(a!=1) {

              answer += i;
            }
        }
        System.out.println(answer);
    }
}
