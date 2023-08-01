package singleton;

public class Animal {

    int birthYear;

    String name;

    static int currentYear = 2023;

    private static Animal animal;

    private Animal(int birthYear, String name) {
        this.birthYear = birthYear;
        this.name = name;
    }

    public static Animal getInstance() {
        if (animal == null) {
            animal = new Animal(1990,"N");
        }
        return animal;
    }

    public int getAge(){
        return currentYear - this.birthYear;
    }
}
