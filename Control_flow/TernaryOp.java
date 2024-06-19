package Control_flow;

public class TernaryOp {
    public static void main(String[] args) {
        int number = 10;

        // Using ternary operator to determine if the number is even or odd
        String result = (number % 2 == 0) ? "Even" : "Odd";

        System.out.println("The number is " + result);

        int a = 10;
        int b = 20;
        int c = 15;

        // Using ternary operator to find the largest number
        int largest = (a > b) ? (a > c ? a : c) : (b > c ? b : c);

        System.out.println("The largest number is " + largest);

        int age = 18;

        // Using ternary operator for assignment
        String eligibility = (age >= 18) ? "Eligible to vote" : "Not eligible to vote";

        System.out.println(eligibility);
    }

}
