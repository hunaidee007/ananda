package singleton;

public class Animal {

    int birthYear;

    String name;

    static int currentYear = 2023;

    public Animal(int birthYear, String name) {
        this.birthYear = birthYear;
        this.name = name;
    }

    public int getAge(){
        return currentYear - this.birthYear;
    }
}
