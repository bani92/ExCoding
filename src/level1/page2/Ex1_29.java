package level1.page2;

public class Ex1_29 {
    public static void main(String[] args) {
        int[] number = {-2,3,0,2,-5};
        int result = 0;
//        number[0] + number[1] + number[2])==0
//        number[0] + number[1] + number[3])==0
//        number[0] + number[1] + number[4])==0
//        number[0] + number[2] + number[3])==0
//        number[0] + number[2] + number[4])==0
//        number[0] + number[3] + number[4])==0
//
//        number[1] + number[2] + number[3])==0
//        number[1] + number[2] + number[4])==0
//        number[1] + number[3] + number[4])==0
//
//        number[2] + number[3] + number[4])==0

        for(int i=0; i<number.length-2 ; i++)
            for(int j=1; j<number.length-1 ; j++)
                for(int k=2 ; k<number.length ; k++)

                    if((number[i] + number[j] + number[k])==0) {
                        if((i==j && i==k && j==k)) {
                            continue;
                        }
                        System.out.println("i = " + i + " j = " + j + " k = " + k);
                        //System.out.println("i = " + i + " " + number[i] + " j = " + j + " " + number[j] + " k = " + k + " " +number[k]);
                        result++;
                    }




        System.out.println(result);
        }

    }

