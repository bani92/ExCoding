package level1.page2;

import java.math.BigDecimal;

public class Ex1_36 {

    public static void main(String[] args) {
        new Ex1_36().test();
    }

    private void test() {
        Fruits fruits = new Apple();
        System.out.println(fruits.getName());
    }

    public class Fruits {
        private String name;

        public Fruits() {
            this.name = "unknown";
        }

        public String getName() {
            return name;
        }
    }

    public class Apple extends Fruits {
        public String getName() {
            return "Apple";
        }
    }

}