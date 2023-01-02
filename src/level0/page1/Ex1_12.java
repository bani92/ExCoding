package level0.page1;

public class Ex1_12 {
    public static void main(String[] args) {
        int[] num_list = {1,3,5,7};
        int[] answer = {};

        answer = new int[2]; // 1,2,3,4,5만큼의 크기가 나옴
        int a = 0;
        int b = 0;
        for(int i=0; i< num_list.length ; i++) {
            if(num_list[i]%2==0) {
                a++;
            } else {
                b++;
            }
        }
        answer[0] = a;
        answer[1] = b;
        System.out.println(answer[0]);
        System.out.println(answer[1]);

    }
}
