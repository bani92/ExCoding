package level1;

public class Ex1_11 {
    public static void main(String[] args) {
        int[] arr = {5,9,7,10};
        int[] answer = {};
        int div = 5;
        int b = 0;
        for(int i=0; i<arr.length ;i++) {
            if(arr[i]%div==0) {

                b++;
            }
        }
        answer = new int[b];

        for(int i=0; i<arr.length ;i++) {
            if(arr[i]%div==0) {
                for(int j=0 ; j<b ; j++) {
                  answer[j] = arr[i];

                    System.out.println(answer[j]);
                }
            }
        }

    }
}
