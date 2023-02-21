package level1.page2;

public class Ex1_33 {
    public static void main(String[] args) {

        int n = 5;
        int[] arr1 = {20,20,28,18,11};
        int[] arr2 = {30,1,21,17,28};
        String s = "";
        for(int i=0 ;i<1 ; i++) {


            while(arr1[i]>=1) {
                System.out.print(arr1[i] + " ");
                s += arr1[i]%2;
                arr1[i] = arr1[i]/2;
                System.out.println(s);
//                System.out.println(arr1[i]);
            }
            System.out.println();

        }


    }
}
