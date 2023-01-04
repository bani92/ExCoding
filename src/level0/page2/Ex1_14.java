package level0.page2;

public class Ex1_14 {
    public static void main(String[] args) {

        int[] s = {400,400,200};

        if(s[0]>=s[1] && s[0]>=s[2]) { // s[0]이 제일 큰수
            if(s[1]+s[2]>s[0]) {
                System.out.println("너냐 1");
            } else {
                System.out.println("너냐 2");
            }
        } else if(s[1]>=s[0] && s[1]>=s[2]) {
            if(s[0]+s[2]>s[1]) {
                System.out.println("아니 1");
            } else {
                System.out.println("아니 2");
            }
        } else if(s[2]>=s[1] || s[2]>=s[0]) {
            if(s[0]+s[1]>s[2]) {
                System.out.println("오 이거 1");
            } else {
                System.out.println("오 이거 2");
            }
        } 
//        if(s[1]>s[0] && s[1]>s[2]) { // s[1]이 제일 큰수
//            if(s[0]+s[2]>s[1]) {
//                System.out.println("아니 1");
//            } else {
//                System.out.println("아니 2");
//            }
//        }
//        if(s[2]>s[1] || s[2]>s[0]) { // s[2]이 제일 큰수
//            if(s[0]+s[1]>s[2]) {
//                System.out.println("오 이거 1");
//            } else {
//                System.out.println("오 이거 2");
//            }
//        }


    }
}
