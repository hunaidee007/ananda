package strategy;

public class Duck {

    public String name;

    Flyable flyable;

    Duck(String nameVar, Flyable flyableVar) { // Flyable flyableVar = new FlywithWings()
        this.name = nameVar;
        this.flyable = flyableVar;

    }


    public void talk (){
        System.out.println("Quack");
    }

    public void fly (){
        //System.out.println("Fly with wings");

        flyable.fly();
    }
}
