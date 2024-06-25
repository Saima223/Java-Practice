// Define a class named 'Person'
class Person {
    // Fields (attributes)
    String name;
    int age;
    String occupation;

    // Method to display the person's details
    void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Occupation: " + occupation);
    }
}

public class Main {
    public static void main(String[] args) {
        // Create the first object of the 'Person' class
        Person person1 = new Person();
        // Set the object's fields
        person1.name = "Alice";
        person1.age = 30;
        person1.occupation = "Engineer";
        // Call the object's method to display details
        person1.displayDetails();

        System.out.println();

        // Create the second object of the 'Person' class
        Person person2 = new Person();
        // Set the object's fields
        person2.name = "Bob";
        person2.age = 25;
        person2.occupation = "Doctor";
        // Call the object's method to display details
        person2.displayDetails();
    }
}
