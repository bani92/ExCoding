package headfirst.Ch1;



public class MiniDuckSimulator {
    public static void main(String[] args) {
        Duck mallard = new MallardDuck();
        mallard.performFly();
        mallard.performQuack();

        mallard.setFlyBehavior(new FlyNoWay());
        mallard.performFly();

        System.out.println();
        System.out.println();
        Duck model = new ModelDuck();
        model.performFly();
        model.performQuack();

        model.setFlyBehavior(new FlyRocketPowered());
        model.performFly();
//        QuackBehavior quackBehavior = mallard.quackBehavior;
//        quackBehavior.quack();

    }
}
