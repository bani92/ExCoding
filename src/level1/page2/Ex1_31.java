package level1.page2;

public class Ex1_31 {
    public static void main(String[] args) {
        int[][] size = {{60,50},{30,70},{60,30},{80,40}};
        int max = 0;
        int min = 0;
        int answer = 0;
        min = size[0][0];
//        배열안에서 제일 큰수를 뽑고 (전체 비교 1번)
//        제일 작은수를 뽑아서 (전체 비교 1번)
        for(int i=0; i<size.length ; i++) {
            for(int j=0;j< size[0].length ; j++) {

                if(size[i][j]>max) {
                    max = size[i][j];
                }
                if(min>size[i][j]) {
                    min = size[i][j];
                }
            }
        }

//        System.out.println(max); // 80
//        System.out.println(min); // 30

        // max와 비교해서 값이 크면 왼쪽 작으면 오른쪽
        // 큰값들이 왼쪽 , 작은 값들이 오른쪽으로 감
        for(int i=0; i<size.length ; i++) {
                if(max - size[i][0] > max - size[i][1] ) {
                    int tmp =  size[i][0];
                    size[i][0] = size[i][1];
                    size[i][1] = tmp;
                }
        }
        // 작은 값들중에서 제일 큰값을 골라서 max랑 곱하기
        for(int i=0; i< size.length ; i++) {
            if(min<size[i][1]) {
                min = size[i][1];
            }
        }
        answer = max * min;
//        for(int i=0; i<size.length ; i++) {
//            for (int j = 0; j < size[0].length; j++) {
//                System.out.print(size[i][j]);
//            }
//            System.out.println();
//        }

    }
}
