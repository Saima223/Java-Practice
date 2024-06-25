public class Calculator {

    // Method to add two integers and return the result
    public int add(int a, int b) {
        return a + b;
    }

    // Main method to demonstrate usage
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        
        // Calling the add method and storing the result
        int result = calculator.add(5, 3);
        
        // Printing the result
        System.out.println("Result of addition: " + result);
    }
}
