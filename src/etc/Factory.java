package etc;

public class Factory {
    public static void main(String[] args) {
        Creator creator1 = new ConcreteCreator1();
        Product product1 = creator1.factoryMethod(); // factoryMethod를 호출하여 new ConcreteProduct1() 생성
        System.out.println(product1.getDesciption());

        Creator creator2 = new ConcreteCreator2();
        Product product2 = creator2.factoryMethod();
        System.out.println(product2.getDesciption());

        // Creator 클래스와 ConcreteCreator1 클래스를 분리하고
        // Creator 클래스의 추상적인 인터페이스를 통해 객체 생성의 책임을
        // ConcreteCreator1 클래스에게 위임 (Factory Method Pattern)
    }

}

abstract class Product {
    public abstract String getDesciption();
}

class ConcreteProduct1 extends Product {

    @Override
    public String getDesciption() {
        return "Concrete Product 1";
    }
}

class ConcreteProduct2 extends Product {

    @Override
    public String getDesciption() {
        return "Concrete Product 2";
    }
}

abstract class Creator {
    public abstract Product factoryMethod();
}

class ConcreteCreator1 extends Creator {

    @Override
    public Product factoryMethod() {
        return new ConcreteProduct1();
    }
}

class ConcreteCreator2 extends Creator {

    @Override
    public Product factoryMethod() {
        return new ConcreteProduct2();
    }
}

