package etc;

public class Ex1 {

    int gcd(int n, int m) {
        int r;
        while(m > 0) {
            r = n % m;
            n = m;
            m = r;
        }
        return n;
    }
    public static void main(String[] args) {

        int[] a = new int[2];
        Ex1 ex1 = new Ex1();
        int n = 2;
        int m = 10;


        if(n<m) {
            int tmp = n;
            n = m;
            m = tmp;
        }

        a[0] = ex1.gcd(n,m);
        a[1] = n * m / a[0];

        System.out.println(a[0]);
        System.out.println(a[1]);
    }
}
