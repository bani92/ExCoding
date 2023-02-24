package etc;

public class OOP {

    private int age;
    private String name;

    public OOP() {}
    public OOP(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public void print() {
        System.out.println("age = " + age + " name = " + name);
    }
}

class main {
    public static void main(String[] args) {
        OOP oop = new OOP(5,"홍길동");
        oop.print();
    }
}

 // OOP 클래스를 선언하여 멤버 변수(name, age)와 생성자 생성 그리고 print() 메서드를 정의
 // main 클래스에서는 OOP 객체를 생성 print() 메서드를 호출
 // 이처럼 클래스를 사용하여 객체를 생성하고 메서드를 호출함으로써 객체 지향적인 프로그래밍을 구현할 수 있습니다.