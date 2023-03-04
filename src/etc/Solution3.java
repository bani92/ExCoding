package etc;

public class Solution3 {

    public int number(int a) {

        int result = 0;

        for(int i=2; i<=a ;i++) { // 1은 소수가 아니기때문에 i=2부터 시작
            int cnt = 0; // 약수를 구별하기위한 카운트 , 안쪽 for문 돌면 0으로 초기화
            for(int k=1; k<=a ; k++) { // 예제 2,3,4,5의 각각의 약수를 구함
                if(i%k==0) {
                    cnt++; // 만약 약수이면 cnt 1상승
                }
            }
            if(cnt==2) { // cnt==2라는 말은 즉 1과 자기자신만 있음(즉 소수)
                result += i;
            }

        }
        return result;
    }
    public static void main(String[] args) {
        Solution3 sol = new Solution3();
        System.out.println(sol.number(5));
    }
}

