package headfirst.Ch1;

public abstract class Duck {
    FlyBehavior flyBehavior;
    QuackBehavior quackBehavior;

    public Duck() {
    }

    public abstract void display();

    public void performFly() {
        flyBehavior.fly();
    }

    public void performQuack() {
        quackBehavior.quack();
    }

    public void setFlyBehavior(FlyBehavior fly) {
        this.flyBehavior = fly;
    }

    public void setQuackBehavior(QuackBehavior quack) {
        this.quackBehavior = quack;
    }

    public void swim() {
        System.out.println("모든 오리는 물에 뜹니다 가짜오리도 뜨죠");
    }
}
