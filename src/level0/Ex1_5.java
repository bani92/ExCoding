package level0;

public class Ex1_5 {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,1};
        int n = 1;
        int m = 0;

        int answer = 0;
        for(int i=0 ; i<arr.length ;i++) {
            if(arr[i]==n) {
                answer++;
            }

        }

    }
}
