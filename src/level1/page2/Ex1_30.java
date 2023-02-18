package level1.page2;

public class Ex1_30 {
    public static void main(String[] args) {
        int[] d = {1,3,2,5,4};
        int budget = 9;
        int result = 0;
        for(int i=0; i<d.length-2 ; i++)
            for(int j=1; j<d.length-1 ; j++)
                for(int k=2 ; k<d.length ; k++) {

                    if((d[i] + d[j] + d[k])<=budget) {
                        System.out.println("i = " + i + " j = " + j + " k = " + k);
                        result++;
                    }
                }
        System.out.println(result);
    }
}
