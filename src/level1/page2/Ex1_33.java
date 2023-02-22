package level1.page2;

public class Ex1_33 {
    public static void main(String[] args) {

        int n = 6;
        int[] arr1 = {46,33,33,21,31,50};
        int[] arr2 = {27,56,19,14,14,10};
//        String[] answer = new String[arr1.length];
//        String[] answer1 = new String[arr2.length];

        String[] answer = new String[arr1.length];
        String[] answer1 = new String[arr2.length];

        String[] result;
        result = new String[arr1.length];


        // 10진수 -> 2진수 변환
        for(int i=0 ;i<arr1.length ; i++) {
            String s = "";
            String s1 = "";
            while(arr1[i]>=1) {

                s += arr1[i]%2;
                arr1[i] = arr1[i]/2;
            }
            while(arr2[i]>=1) {
                s1 += arr2[i]%2;
                arr2[i] = arr2[i]/2;
            }
        StringBuffer sb = new StringBuffer(s);
        StringBuffer sb1 = new StringBuffer(s1);
        // 모자란 자릿수 0으로 채우기
            if(sb.length()<n) {
                while(sb.length()<n) {
                    sb.append(0);
                }
            }
            if(sb1.length()<n) {
                while(sb1.length()<n) {
                    sb1.append(0);
                }
            }
            answer[i] = sb.reverse().toString();
            answer1[i] = sb1.reverse().toString();

        }
        // 치환하기
        for(int k=0; k<result.length ;k++) {
            result[k] = "";
            for(int j=0; j<answer[k].length(); j++) {
                int s2 =(answer[k].charAt(j) | answer1[k].charAt(j));
                System.out.println(s2);
                if(s2 == 49) {
                    result[k] += "#";

                } else {
                    result[k] += " ";
                }
            }
            System.out.println();
        }
        for(int z=0 ; z<result.length ; z++) {
            System.out.println(result[z]);
        }

    }
}
