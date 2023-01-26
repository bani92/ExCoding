package level1.page1;

public class Ex1_9 {
    public static void main(String[] args) {
      int num = 626331;
      int answer = 0 ;
      long n = num;
      int a = 0;

      if(n==1) {
          answer = 0;
      }
      while(true) {
          if(n%2==0) {
              n = n /2;

          }  else if(n==1) {
              System.out.println("a" + a);
              break;
          } else if(n%2!=0) {
              n = n * 3 + 1;
          }
          System.out.println("n = " + n);

         if(a==500 && n!=1) {
             answer = -1;
             System.out.println("마지막 ="+answer);
             break;
         }
         a++;
         answer = a;
          System.out.println("answer = " + answer);
      }



    }
}
