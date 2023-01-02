package level0.page1;

public class Ex1_3 {
    public static void main(String[] args) {
        int n = 11;
        int answer =0;
        //  2 4
        // n 이 0이 될때까지
      for(int i=n; i>0 ; i--) {

          if(i%2==0) {
              answer += i;
              System.out.println(answer);
          }
      }


    }
}
