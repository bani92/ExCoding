package level1.page1;

public class Ex1_12 {
    public static void main(String[] args) {
        String number = "01033334444";
        String answer = "";

        // 배열로만든다
        String[] a = new String[number.length()];

        for(int i=0 ; i<number.length() ;i++) {

            if(i<number.length()-4) {
                a[i] = "*";
            } else {
                a[i] = String.valueOf(number.charAt(i));
            }
        }

                for(int i=0; i<a.length ; i++) {
          answer += a[i];
        }





    }
}
