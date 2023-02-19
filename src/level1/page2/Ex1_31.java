package level1.page2;

public class Ex1_31 {
    public static void main(String[] args) {
        int[][] size = {{60,50},{30,70},{60,30},{80,40}};
        int max = 0;
        int min = 0;

        for(int i=0; i<size.length ; i++) {
            if(size[i][0]>max) {
                max = size[i][0];
            }
        }
        System.out.println(max);

//        for(int i=0; i<size.length ; i++) {
//            for(int j=0; j<size.length ; j++) {
//
//            }
//        }

    }
}
