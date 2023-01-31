package level1.page2;

public class Ex1_22 {
    public static void main(String[] args) {
        int price = 3;
        int money = 20;
        int count = 1;

        long answer = 0;

        for(int i = 1 ; i <= count ; i++) {
            answer += price * i;
        }
        if(answer>money) {
            answer -= money;
        } else {
            answer = 0;
        }
        System.out.println(answer);
    }
}


//          3 , 6  , 9 , 12
//         이용요금 3원 price
//        가지고있는돈 20원 money
//        이용횟수 4번 count
//        모자라는돈 10원 result
//          금액이 모자라지않으면 result =0;