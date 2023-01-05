package level1;

public class Ex1_3 {
    public static void main(String[] args) {

        long n = 12345;
        int[] answer = {};
        String a = String.valueOf(n);
        answer = new int[a.length()];

//        for(int i=a.length(); i>0 ;i--) {
//            answer[i-1] = a.charAt(i-1)-48;
//            System.out.print(i-1 + " ");
//            System.out.println(answer[i-1]);
//        }
        for(int i=0 ,j=a.length(); i<a.length() ; i++) {
            answer[i] = a.charAt(j-1)-48;
            System.out.println(answer[i]);
            j--;
        }

    }
}
