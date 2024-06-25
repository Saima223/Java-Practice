public class Heapp {

    public static void main(String[] args) {
        // Object 'person' is stored on the heap
        Person person = new Person("Alice", 30);

        System.out.println("Person: " + person.getName() + ", Age: " + person.getAge());
    }
}

class Person {
    private String name;
    private int age;

    // Constructor to initialize Person object
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Getter method for name
    public String getName() {
        return name;
    }

    // Getter method for age
    public int getAge() {
        return age;
    }
}
