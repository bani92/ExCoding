package level1.page3;

import java.util.Arrays;

public class Ex1_38 {
    public static void main(String[] args) {
        int[] array = {1,5,2,6,3,7,4};
        int[][] commands = {{2,5,3},{4,4,1},{1,7,3}};
        int[] answer = {};
        answer = new int[commands.length];

        for(int i=0; i< commands.length ; i++) {
            int[] array2 = Arrays.copyOfRange(array,commands[i][0]-1,commands[i][1]);
            Arrays.sort(array2);
            answer[i] = array2[commands[i][2]-1];


        }

    }
}
