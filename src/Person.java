

public class Person {
//part 1
    private String name;

    // returns the Person's name

    public String getName() {
        return name;
    }
    // changes the name property to the passed value
    public void setName(String name) {
        this.name = name;
    }
    // prints a message to the console using the Animal's name
    public void sayHello(){
        System.out.println("Hello " + name);
    }

    public Person(String name) {
        this.name = name;
    }

    public static void main(String[] args) {
//        part 1
//        Person Animal = new Person("Joe");
//        Animal.setName("Jeff");
//        System.out.println(Animal.getName());
//        Animal.sayHello();

//        part 2
//        Person person1 = new Person("John");
//        Person person2 = new Person("John");
//        System.out.println(person1.getName().equals(person2.getName()));
//        System.out.println(person1 == person2);

//        Person person1 = new Person("John");
//        Person person2 = person1;
//        System.out.println(person1 == person2);

        Person person1 = new Person("John");
        Person person2 = person1;
        System.out.println(person1.getName());
        System.out.println(person2.getName());
        person2.setName("Jane");
        System.out.println(person1.getName());
        System.out.println(person2.getName());
    }
}
