public class TypeConversn {
    public static void main(String[] args) {
        int num1 = 10;
        double num2 = 5.5;

        double sum = num1 + num2; // Widening conversion (int to double)

        System.out.println(sum); // Output: 15.5 (no data loss)

        // Type Casting
        double pi = 3.14159;
        int roundedPi = (int) pi; // Narrowing conversion, might lose precision

        System.out.println(roundedPi); // Output: 3 (precision loss)
    }

}
