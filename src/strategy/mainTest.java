package strategy;

import strategy.behavior.*;

public class mainTest {
    public static void main(String[] args) {
        Duck duck1 = new Duck("Утка 1");
        duck1.setFlyBehavior(new FlyWithWings());
        duck1.setQuackBehavior(new Quack());

        Duck duck2 = new Duck("Утка 2");
        duck2.setFlyBehavior(new FlyNotWay());
        duck2.setQuackBehavior(new Squeak());

        Duck duck3 = new Duck("Утка 3");
        duck3.setFlyBehavior(new FlyWithWings());
        duck3.setQuackBehavior(new MuteQuack());

        duck1.printName();
        duck1.performFly();
        duck1.performQuack();

        duck2.printName();
        duck2.performFly();
        duck2.performQuack();

        duck3.printName();
        duck3.performFly();
        duck3.performQuack();
    }
}
