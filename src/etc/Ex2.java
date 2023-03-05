package etc;

public class Ex2 {
        // polymorphism
    public int minus(int a, int b) {
        return a-b;
    }
    public static void main(String[] args) {
        Ex2 ex2 = new Ex2();
        System.out.println(ex2.minus(1,2));

        Ex2 ex3 = new Ex222();
        System.out.println(ex3.minus(1,2));

        Ex222 ex222 = new Ex222();
        System.out.println(ex222.minus(1,2));
    }
}

class Ex222 extends Ex2 {

    public int add(int a , int b) {
        return a+b;
    }

    @Override
    public int minus(int a, int b) {
        return a-b;
    }
}
