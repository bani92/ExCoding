package level1.page2;

public class Ex1_32test {
    public static void main(String[] args) {

    }

//    class Atom {
//        Atom() {
//            System.out.println("atom");
//        }
//    }
//    class Rock extends Atom {
//        Rock(String type) {
//            System.out.println(type);
//        }
//    }
//    public class Mountain extends Rock {
//        Mountain() {
//            super("granite");
//            new Rock("granite");
//        }
//
//
//    }
//    public static void main(String[] args) {
//        new Mountain();
//    }
//     class Line {
//     public class Point { public int x,y;}
//     public Point getPoint() { return new Point(); }
//    }
//
//     class Triangle {
//         public Triangle() {
//             Line.Point p = (new Line()).getPoint();
//                }
//     }
//public static void main(String[] args) {
//    StringBuilder sb1 = new StringBuilder("123");
//    sb1.append("abc");
//    // System.out.println(sb1);
//
//    String a = "123";
//    a = a.concat("abc");
//    System.out.println(a);
//}

//public static void main(String[] args) {
//    int x = 5;
//    Ex1_32 p = new Ex1_32();
//    p.doStuff(x);
//    System.out.println("main =" + x);
//    }
//    void doStuff(int x) {
//        System.out.println("doStuff x = " + x++);
//    }
//class Animal { public String noise() { return "peep"; } }
//    class Dog extends Animal {
//     public String noise() { return "bark"; }
// }
//
// class Cat extends Animal {
//     public String noise() { return "meow"; }
//}
//
//    public static void main(String[] args) {
//
//        Animal animal = new Dog();
//        Cat cat = (Cat)animal;
//        System.out.println(cat.noise());
//    }

//      public static void main(String[] args) {
//                 Integer x = 400;
//                 Integer y = x;
//                 x++;
//                 StringBuilder sb1 = new StringBuilder("123");
//                 StringBuilder sb2 = sb1;
//                 sb1.append("5");
//          System.out.println(x);
//                 System.out.println((x==y) + " " + (sb1==sb2));
//             }
//
//    private Object o;
//       private void doSomethingElse(Object obj) { o = obj; }
//       public void doSomething() {
//           Object o = new Object();
//           doSomethingElse(o);
//           o = new Object();
//           doSomethingElse(null);
//           o = null;
//       }

}
