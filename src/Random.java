public class Random {
    public static void main(String[] args) {
        int Num[] = new int[6];
        boolean room[] = new boolean[6];

        int index = 0;
        int rnd;

        while(index < 6) {
            rnd = (int)(Math.random()*6);
            System.out.println(rnd);

            if(!room[rnd]) {
                room[rnd] = true;
                Num[index] = rnd;
                index++;
            }

        }
        for(int i=0; i<Num.length ; i++) {
            System.out.print(Num[i]+ " ");
        }
    }
}
