package level1.page2;

public class Ex1_25 {
    public static void main(String[] args) {
        int n = 100;
        int m = 120;
        int[] answer = {};
        answer = new int[2];

//        if(m>n && m%n==0) {
//            answer[0] = n;
//            answer[1] = m;
//        } else if(n>m && n%m==0) {
//            answer[0] = m;
//            answer[1] = n;
//
//        } else if(m==n) {
//           answer[0] = n;
//           answer[1] = n;
//        } else {
//            answer[0] = 1;
//            answer[1] = n*m;
//        }

        for(int i=1; i<=n;i++) {
           if(n%i==0) {
               System.out.println(i);
           }
        }

        System.out.println();
        for(int j=1; j<=m;j++) {
            if(m%j==0) {
                System.out.println(j);
            }
        }
//        System.out.println(answer[0]);
//        System.out.println(answer[1]);
    }
}
