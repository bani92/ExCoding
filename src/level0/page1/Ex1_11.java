package level0.page1;

public class Ex1_11 {
    public static void main(String[] args) {
        String my = "jarson";
        String answer = "";

        System.out.println(my.length());
        // String 을 배열로 배열을 String 으로
        for(int i=my.length(); i>0 ;i--) {
             answer += my.charAt(i-1);
        }

        System.out.println(answer);
    }
}
