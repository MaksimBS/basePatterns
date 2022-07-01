package strategy;

import strategy.behavior.FlyBehavior;
import strategy.behavior.QuackBehavior;

public class Duck {
    private String name;
    private FlyBehavior flyBehavior;
    private QuackBehavior quackBehavior;

    public Duck(String name) {
        this.name = name;
    }

    public void setFlyBehavior(FlyBehavior flyBehavior) {
        this.flyBehavior = flyBehavior;
    }

    public void setQuackBehavior(QuackBehavior quackBehavior) {
        this.quackBehavior = quackBehavior;
    }

    public void performFly(){
        flyBehavior.fly();
    }

    public void performQuack(){
        quackBehavior.quack();
    }

    public void printName() {
        System.out.println(name);
    }
}
