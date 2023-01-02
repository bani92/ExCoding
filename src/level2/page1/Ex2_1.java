package level2.page1;

public class Ex2_1 {
    public static void main(String[] args) {
        int storey = 215;
        int answer = 0;
        int a = 1;
        String n = String.valueOf(storey);
        for(int i=0; i<n.length()-1 ;i++) {
            a =  a * 10;
        }




       // storey -= 10 * n.length();

//        -1 +1 -10 +10 -100 +100
//        엘리베이터가 위치해 있는 층과
//        버튼의 값을 더한 결과가
//        0보다 작으면 엘리베이터는 움직이지 않습니다
//
//        버튼 한번당 마법돌 한개
//        16층 => -1 6번 , -10 1번   7번
//                +1 4번 , -10 2번   6번
//
//        2554 => -1 4번 -10 5번 -100 5번 -1000 2번  16번
//        어떤층에서 엘리베이터를 타고 0층으로
//        내려가는데 필요한 마법의 돌 최소 개수
//
//        엘리베이터 있는 층 storey

        // 1. storey의 자릿수를 잰다
        // 2. 자릿수만큼 10c의 0하고 가깝게 - or + 를 한다.
        //

        // 145  -100 - 40 -1*5
        // 215  -100 2번 -10 1번 -1 5번
    }
}
