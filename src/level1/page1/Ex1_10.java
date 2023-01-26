package level1.page1;

public class Ex1_10 {
    public static void main(String[] args) {
        String[] seoul = {"jane","kim","jain"};
        String answer = "";
        int x = 0;


        for(int i=0; i<seoul.length;i++) {
            if(seoul[i].equals("kim")) {
                x = i;
            }
        }
        answer = "김서방은 " + x + "에 있다";
        System.out.println(answer);
    }

}
