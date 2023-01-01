package level0;

public class Ex1_9 {
    public static void main(String[] args) {

        String[] str = {"We","ars","the","world!"};
        int[] answer = {};



        answer = new int[str.length];
        for(int i=0 ; i<str.length ; i++) {

             answer[i] = str[i].length();

        }


    }
}
