package singleton;

public class MainClass {

    public static void main(String args[] ) {
        /*StringUtil stringUtil = StringUtil.getInstance();
        StringUtil stringUtil1 =StringUtil.getInstance();
        StringUtil stringUtil2 = StringUtil.getInstance();

        System.out.println(stringUtil);
        System.out.println(stringUtil1);
        System.out.println(stringUtil2);*/

        Animal animal = Animal.getInstance();
        Animal animal1 = Animal.getInstance();

        animal1.name ="B";
        System.out.println(animal1.name);

        System.out.println(animal.name);


        changeName(animal1);

        System.out.println(animal1.name);

        System.out.println(animal.name);



        Animal newAnimal = Animal.getInstance();

        System.out.println(animal);
        System.out.println(animal1);
        System.out.println(newAnimal);

        animal = null;
        animal1 = null;
        newAnimal = null;

       // Animal animal2 = new Animal(2001,"C");


       // System.out.println(animal.getAge());




    }

    public static void changeName(Animal animal2) // Animal animal2 = animal 1;
    {
        animal2.name ="C";
    }
}
