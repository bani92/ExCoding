package level1;

public class Ex1_9 {
    public static void main(String[] args) {
        int num = 16;
        int answer = 0;
        int a = 0;
        int b = 0;
//        while(true) {
//            if(num%2==0) {
//                num /= 2;
//            } else if(num==1) {
//               answer = 0;
//               break;
//            } else if(num%2!=0) {
//                num = num * 3 +1;
//            } else if(a==500) {
//                answer = -1;
//                break;
//            }
//            a++;
//            System.out.println(num);
//            System.out.println("a="+a);
//        }

        while(true) {
            if(num%2==0) {
                num /= 2;
            } else if(num==1) {
                break;
            } else if(num%2!=0) {
                num = num * 3 + 1;


            }
            b++;
            System.out.println(num);
            System.out.println("B="+b);
//            if(b==500 && num!=1) {
//
//            }
        }




    }
}
