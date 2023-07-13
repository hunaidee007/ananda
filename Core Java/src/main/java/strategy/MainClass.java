package strategy;

import java.util.ArrayList;
import java.util.List;

public class MainClass {

    public  static void main (String args [] ) {

        Duck duck = new Duck("A", new FlyWithWings());
        duck.talk();

        duck.fly();


        RubberDuck rubberDuck = new RubberDuck("B",new FlyWithoutWings());
        rubberDuck.talk();

        rubberDuck.fly();

        RubberDuck rubberDuck1 = new RubberDuck("B",new FlyWithWings());
        rubberDuck1.talk();

        rubberDuck1.fly();

        FlyWithoutWings flyWithoutWings = new FlyWithoutWings();
        Flyable flyable = new FlyWithoutWings(); // Upcasting
        flyable.fly();

        List<String> stringList = new ArrayList<String>();
        sort(stringList);

    }

    public static void sort(List a) {

    }
}
