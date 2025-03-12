package new_202503.day2;

public class 글자_이어_붙여_문자열_만들기 {
    public static void main(String[] args) {
        String my_string = "cvsgiorszzzmrpaqpe";
        int[] index_list = new int[]{16, 6, 5, 3, 12, 14, 11, 11, 17, 12, 7};

        StringBuilder sb = new StringBuilder();
        for(int i=0; i<index_list.length; i++) {
            sb.append(my_string.charAt(index_list[i]));
        }
        System.out.println(sb);
    }
}
