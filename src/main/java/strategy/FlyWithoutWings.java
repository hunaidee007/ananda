package strategy;

public class FlyWithoutWings implements Flyable{
    @Override
    public void fly() {
        System.out.println("Fly without wings");
    }
}
