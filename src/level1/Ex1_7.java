package level1;

public class Ex1_7 {
    public static void main(String[] args) {

       int x = 13;
       String s = String.valueOf(x);
       int[] x1 = new int[s.length()];
       boolean answer = true;
        int y = 0;
       for(int i=0; i<s.length() ; i++) {
            x1[i] = s.charAt(i) - 48;
       }
        for(int i=0; i<s.length() ; i++) {
              y += x1[i];
        }
        if(x%y==0) {
            answer = true;
            System.out.println(answer);
        } else {
            answer = false;
            System.out.println(answer);
        }


    }
}
