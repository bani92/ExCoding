package level0.page1;

public class Ex1_6 {
    public static void main(String[] args) {
        int arr[] = {149,180,192,170};
        int height = 167;
        int answer =0;
        for(int i=0; i<arr.length ; i++) {
            if(height<arr[i]) {
                answer++;
            }

        }
    }

}
