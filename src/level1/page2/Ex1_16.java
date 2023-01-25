package level1.page2;

public class Ex1_16 {
    public static void main(String[] args) {
        String answer = "abde";
        int a = answer.length()/2;
       int b = answer.length()/2-1;

       if(answer.length()%2!=0) {
        answer = String.valueOf(answer.charAt(a));
       } else {
        answer = String.valueOf(answer.charAt(b))+ String.valueOf(answer.charAt(a));
       }
        System.out.println(answer);
    }
}
