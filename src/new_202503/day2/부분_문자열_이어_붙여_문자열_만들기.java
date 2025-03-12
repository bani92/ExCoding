package new_202503.day2;

public class 부분_문자열_이어_붙여_문자열_만들기 {
    public static void main(String[] args) {
        String[] my_strings = new String[]{"progressive", "hamburger", "hammer", "ahocorasick"};
        int[][] parts = new int[][]{{0, 4}, {1, 2}, {3, 5}, {7, 7}};
        StringBuilder sb = new StringBuilder();

        for(int i=0; i<my_strings.length; i++) {
            String myString = my_strings[i];
            int start = parts[i][0];
            int end = parts[i][1];
            sb.append(myString.substring(start, end + 1));
        }
        System.out.println(sb);

    }
}
