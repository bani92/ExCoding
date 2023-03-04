package etc;

public class Solution2 {

//    [알고리즘] 문제 #2. 최소 공배수의 합
//    양의 정수의 배열 arr이 주어질 때 모든 원소들이 둘 씩 짝지어 생기는 최소공배수를 합한 값을 리턴하는 solution 함수를 작성해주세요.
//
//🚩 [제한사항]
//
//            - arr 내 원소들은 중복되지 않습니다.
//- arr 배열의 길이는 최소 3입니다.
//- 입출력 예 : [ 1 , 2 , 3 ] → ( {1 | 2} → 2 + { 1 | 3 } → 3 + { 2 | 3 } → 6 ) = 11

    // 두 수의 최대공약수를 구하는 함수
    public int gcd(int a, int b) {
        while (b != 0) {
            int r = a % b;
            a = b;
            b = r;
        }
        return a;
    }

    // 두 수의 최소공배수를 구하는 함수
    public int lcm(int a, int b) {
        return a * b / gcd(a, b);
    }

    // 최소공배수 더하는 함수
    public int resultprice(int[] arr) {
        int result = 0;
        for(int i=0; i<arr.length; i++) {
            for(int j=i+1; j<arr.length; j++) {
                result += lcm(arr[i],arr[j]);
            }
        }
        return result;
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4};
        Solution2 sol = new Solution2();
        System.out.println(sol.resultprice(arr));
    }
}
