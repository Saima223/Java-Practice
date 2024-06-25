public class Overload {

    // Method to add two integers
    public int add(int a, int b) {
        return a + b;
    }

    // Method to add three integers
    public int add(int a, int b, int c) {
        return a + b + c;
    }

    // Method to concatenate two strings
    public String add(String a, String b) {
        return a + b;
    }

    // Main method to demonstrate method overloading
    public static void main(String[] args) {
        Overload example = new Overload();
        
        // Calling the different overloaded methods
        int sum1 = example.add(5, 3);
        int sum2 = example.add(5, 3, 2);
        String concat = example.add("Hello, ", "world!");
        
        // Printing the results
        System.out.println("Sum of two integers: " + sum1);
        System.out.println("Sum of three integers: " + sum2);
        System.out.println("Concatenated string: " + concat);
    }
}
