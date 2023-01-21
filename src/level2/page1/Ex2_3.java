package level2.page1;

public class Ex2_3 {
    public static void main(String[] args) {
        String s = "3Pop   UNFOllow  me";
        String answer = "";
        // 공백이 있더라도 결과물은 다르게
//        s = s.replaceAll("\\s+"," ");
        // 텍스트 띄워쓰기로 나누기
























        String[] b = s.split("\\s+");


        for(int i=0; i<b.length; i++) {


            // 첫글자가 소문자면
            // 첫글자만 대문자로 만들고 - 함수가 없을듯?
            // 그러면 다 대문자로 만들고 맨앞자리만 추출해서
            // 기존 String에 합치기

            // b[0] = 3pop   b[1] = unFollow   b[2] = me

            if( b[i].charAt(0) >= 'a' &&  b[i].charAt(0) <= 'z') {

                b[i] = b[i].toLowerCase();
               b[i] = b[i].replace(b[i].substring(0,1), b[i].toUpperCase().substring(0,1));
                answer += b[i] + " ";

            } else if( b[i].charAt(0) >= 'A' &&  b[i].charAt(0) <= 'Z') {
                // 첫글자가 대문자이고 중간에 대문자가 있을시?
                b[i] = b[i].toLowerCase();
                b[i] = b[i].replace(b[i].substring(0,1), b[i].toUpperCase().substring(0,1));
                   answer += b[i] + " ";
            } else {
                b[i] = b[i].toLowerCase();
                answer += b[i] + " ";
            }
        }
        answer = answer.trim();

        System.out.println(answer);

    }
}
