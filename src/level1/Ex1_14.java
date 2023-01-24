package level1;

public class Ex1_14 {
    public static void main(String[] args) {
        int[] absolutes = {1,2,3};
        boolean[] signs = {false,false,true};
        int answer = 0;
        for(int i=0; i<3 ; i++) {

            if(signs[i]==false) {
                answer -= absolutes[i];
            } else {
                answer += absolutes[i];
            }
        }

        System.out.println(answer);


    }
}
