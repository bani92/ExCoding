package level1.page2;

public class Ex1_24 {
    public static void main(String[] args) {

       int n = 13;
       int m = 17;

       int answer = 0;
        // 13 14 15 -16 17
        for(int j=n ; j<=m ; j++) {
            int a = 0;
            for(int i=1; i<=j ; i++) {
                if(j%i==0) {
                    a++;
                }
            }

            if(a%2==0) {
                answer += j;
            } else {
                answer -= j;
            }
            System.out.println(answer);
        }


    }
}
