import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {

       ArrayList<Ex001> arrayist = new ArrayList<Ex001>();

       Ex001 ex01 = new Ex001();
       ex01.setA("a");
       ex01.setB(2);
       ex01.setC(5);
       arrayist.add(ex01);

       for(Ex001 s : arrayist) {
           System.out.println(s.getA());
           System.out.println(s.getB());
           System.out.println(s.getC());
       }




    }
}

class Ex001 {

    private String a;
    private int b;
    private int c;

    public String getA() {
        return a;
    }
    public void setA(String a) {
        this.a = a;
    }
    public int getB() {
        return b;
    }
    public void setB(int b) {
        this.b = b;
    }
    public int getC() {
        return c;
    }
    public void setC(int c) {
        this.c = c;
    }
}