package level2.page1;

public class Ex2_2 {
    public static void main(String[] args) {
        String s = "-1 -1";
        String answer = "";
        // 비교를 해서 가장 낮은숫자 고르기
        int imax = 0;
        int imin = 999;
        String[] a = s.split(" ");

        //문자
        imax = Integer.parseInt(a[0]);
        for(int i=0; i<a.length ; i++) {

            imax = Math.max(Integer.parseInt(a[i]),imax);
            imin = Math.min(Integer.parseInt(a[i]),imin);

        }

        answer += String.valueOf(imin);
        answer += imax + " ";

        System.out.println(answer);

    }
}
