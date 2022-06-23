public class JavaClasses {
    public static void main(String[] args) {

//        Pokemon p1 = new Pokemon();
//        p1.name = "Pikachu";
//        p1.level = 10;
//
//        System.out.println(p1.name + " " + p1.level);
//
//        Pokemon p2 = new Pokemon();
//        p2.name = "Eevee";
//        p2.level = 20;
//
//        p2.attack();
//
//        Pokemon p3 = new Pokemon();
//        System.out.println(p3.level);
//
//        Pokemon p4 = new Pokemon("Shrek", 1337);
//        System.out.println(p4.name + " " + p4.level);
//        p4.attack();
        Person person1 = new Person("Eugene", 27);
        // System.out.println(person1.name + " " + person1.age);
        person1.speak();

        int year1 = person1.calculateYears();
        System.out.println(year1);

        Person person2 = new Person();
        person2.setName("Scarick");
        System.out.println(person2.getName());

        Person person3 = new Person();
        person3.setName("Nick");
        System.out.println(person3.getName());

        person2.setAge(15);
        System.out.println(person2.getAge());


    }
}


class Pokemon {
    String name;
    int level;

    Pokemon() {
        level = 1;
    }

    Pokemon(String pName, int pLevel) {
        this.name = pName;
        this.level = pLevel;
    }

    void attack() {
        System.out.println(name + " attack!");
    }
}

class Person {
    private String name;
    private int age;

    public Person() {
        System.out.println("Hello, this is A FIRST constructor!");
        this.name = "Default";
        this.age = 0;
    }

    public Person(String name) {
        System.out.println("Hello, this is A SECOND constructor");
        this.name = name;
    }

    public Person(String name, int age) {
        System.out.println("Hello, this is A THIRD constructor");
        this.name = name;
        this.age = age;
    }

    void speak() {
        for (int i = 0; i < 3; i++) {
            System.out.println("My name is " + name + " and my age is " + age);
        }
    }

    int calculateYears() {
        return 65 - age;
    }

    // Name setter

    public void setName(String name) {
        this.name = name;
    }

    // Name getter

    public String getName() {
        return this.name;
    }

    // Age setter

    public void setAge(int age) {
        this.age = age;
    }

    // Age getter

    public int getAge() {
        return this.age;
    }



}