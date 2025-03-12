package new_202503.day2;

public class 수_조작하기_2 {
    public static void main(String[] args) {
        int[] numLog = new int[]{0, 1, 0, 10, 0, 1, 0, 10, 0, -1, -2, -1};
        String result = "wsdawsdassw";

        System.out.println(numLog.length); // 12
        System.out.println(result.length()); // 11
        StringBuilder sb = new StringBuilder();

        for (int i=0 ; i<numLog.length-1 ; i++) {
            int num_result = numLog[i + 1] - numLog[i];

            if(num_result == 1) {
                sb.append("w");
            } else if(num_result == -1) {
                sb.append("s");
            } else if(num_result == 10) {
                sb.append("d");
            } else if(num_result == -10) {
                sb.append("a");
            }
        }
        System.out.println(sb.toString().equals(result));
    }
}
