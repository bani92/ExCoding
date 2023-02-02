package level1.page2;

public class Ex1_23 {
    public static void main(String[] args) {

        //arr1[0][0] , [0][1] , [0][2]  , [1][0] , [1][1]

        int[][] arr1 = {{1},{2}};
        int[][] arr2 = {{3},{4}};
        int[][] answer = new int[arr1.length][arr2.length];
        System.out.println(arr1[1][0]);

        for(int i=0; i<arr1.length ; i++) {
            for(int j=0 ; j<arr1[0].length ; j++) {
                answer[i][j] = arr1[i][j] + arr2[i][j];
                System.out.print(answer[i][j]);
            }
            System.out.println();
        }
    }
}
