package etc;

public class OOP {

   private String name;
   private int age;

   public OOP() {
   }
    public OOP(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void birthday() {
        this.age++;
    }
}

class main {
    public static void main(String[] args) {
       OOP person = new OOP("홍길동",20);
        System.out.println(person.getName() + " - " + person.getAge());

        person.birthday();
        person.birthday();

        System.out.println(person.getName() + " - " + person.getAge());
    }
}

 // OOP 클래스를 선언하여 멤버 변수(name, age)와 생성자 생성 그리고 print() 메서드를 정의
 // main 클래스에서는 OOP 객체를 생성 print() 메서드를 호출
 // 이처럼 클래스를 사용하여 객체를 생성하고 메서드를 호출함으로써 객체 지향적인 프로그래밍을 구현할 수 있습니다.