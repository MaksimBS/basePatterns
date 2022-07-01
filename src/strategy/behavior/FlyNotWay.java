package strategy.behavior;

public class FlyNotWay implements FlyBehavior {

    @Override
    public void fly() {
        System.out.println("Не летает ...");
    }
}
