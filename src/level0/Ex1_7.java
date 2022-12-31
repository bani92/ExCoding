package level0;

public class Ex1_7 {
    public static void main(String[] args) {
        int arr[] = {1,2};
        int answer = 0;
        if(arr[0]>0 && arr[1]>0) {
            answer = 1;
        } else if(arr[0]<0 && arr[1]>0) {
            answer = 2;
        }
        else if(arr[0]<0 && arr[1]<0) {
            answer = 3;
        }
        else if(arr[0]>0 && arr[1]<0) {
            answer = 4;
        }
    }
}
