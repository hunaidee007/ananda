package singleton;

public class MainClass {

    public static void main(String args[] ) {
       StringUtil stringUtil = StringUtil.getInstance();
        StringUtil stringUtil1 =StringUtil.getInstance();
        StringUtil stringUtil2 = StringUtil.getInstance();

        System.out.println(stringUtil);
        System.out.println(stringUtil1);
        System.out.println(stringUtil2);

       /* Animal animal = new Animal(1985,"A");
        Animal animal1 = new Animal(1990,"B");
        Animal animal2 = new Animal(2001,"C");

        System.out.println(animal.getAge());*/




    }
}
