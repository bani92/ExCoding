package etc;
import java.util.HashMap;
import java.util.Map;

public class Solution {
    public static void main(String[] args) {
//        { answer : 정답 번호 (1~5), score : number }로 이루어진 배열 arr이 정답지로 넘어갈 때,
//                가장 점수가 높은 수포자의 이름과 점수를 “이름 : 점수” 형태로 리턴해 주세요
//        시험 응시자는 1번으로 모두 찍은 a, 3번으로 모두 찍은 b, 5번으로 모두 찍은 c가 있습니다.
//
// [입출력 예]
//
//[ { answer : 1, score : 5 }, { answer : 3, score : 3 }, { answer : 2, score : 4 } ] → a : 5
//                [ { answer : 1, score : 5 }, { answer : 5, score : 5 }, { answer : 2, score : 4 } ] → a : 5, c : 5

        int[][] arr1 = {{1, 5}, {5, 5}, {2, 4}};
        Solution solution = new Solution();
        System.out.println(solution.HighScore(arr1));

    }
    public String HighScore(int[][] arr) {
        Map<Integer, Integer> scores = new HashMap<>(); // 점수를 저장할 맵 생성
        scores.put(1, 0);  // 점수를 0으로 초기화
        scores.put(2, 0);
        scores.put(3, 0);

        // 각 수포자들의 점수 계산
        for (int i = 0; i < arr.length; i++) {
            int answer = arr[i][0]; // 정답번호
            int score = arr[i][1]; // 문제점수

            if (answer == 1) {
                scores.put(1, scores.get(1) + score); // a의 점수 증가
            } else if (answer == 3) {
                scores.put(2, scores.get(2) + score); // b의 점수 증가
            } else if (answer == 5) {
                scores.put(3, scores.get(3) + score); // c의 점수 증가
            }
        }

        // 가장 높은 점수 가진 이름과 점수
        int max = 0;
        String result = "";
        for (int i = 1; i <= scores.size(); i++) {
            if (max < scores.get(i)) {
                max = scores.get(i); // 가장 높은 점수
                result = (char) ('a' + i - 1) + " : " + max + " ";
            } else if (max == scores.get(i)) { // 높은 점수가 같을때
                result += ", " + (char) ('a' + i - 1) + " : " + max + " ";
            }
        }
        return result;
    }
}
