public class Hello {

    public static void main(String[] args) {

        // Print a greeting message
        System.out.println("Hello!!!");

        // Declare and initialize variables with different data types
        int num1 = 9;               // Integer
        byte by = 127;              // Byte (8-bit signed integer)
        short sh = 558;             // Short (16-bit signed integer)
        long l = 5854L;             // Long (64-bit signed integer)

        float f = 5.8f;             // Float (single-precision floating-point)
        double d = 5.8;             // Double (double-precision floating-point)

        char c = 'k';               // Character

        boolean b = true;           // Boolean (true or false)

        // Literals (different ways to represent values)
        int n = 0b101;              // Binary literal (base 2)
        System.out.println(n);       // Output: 5

        int num2 = 0x7E;             // Hexadecimal literal (base 16)
        System.out.println(num2);       // Output: 126

        int num3 = 10_000_000;       // Underscore for readability (int)
        System.out.println(num3);       // Output: 10000000

        // Implicit type conversion (float to double)
        float num4 = 56;
        System.out.println(num4);       // Output: 56.0 (printed as double)

        double num5 = 56;
        System.out.println(num5);       // Output: 56.0 (double)

        // Scientific notation (double)
        double num6 = 12e10;
        System.out.println(num6);       // Output: 1.2E11

        boolean num7 = true;
        System.out.println(num7);       // Output: true

        char ch = 'a';
        System.out.println(ch);       // Output: a

        // Increment character variable (prints 'b')
        c++;
        System.out.println(c);

        // Separate variable for increment (prints 'b')
        char c1 = 'a';
        c1++;
        System.out.println(c1);
    }
}
