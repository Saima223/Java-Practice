public class RnLOperator {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        int c = 30;

        System.out.println("a == b: " + (a == b)); // false
        System.out.println("a != b: " + (a != b)); // true
        System.out.println("a > b: " + (a > b)); // false
        System.out.println("a < b: " + (a < b)); // true
        System.out.println("a >= b: " + (a >= b)); // false
        System.out.println("a <= b: " + (a <= b)); // true

        boolean x = true;
        boolean y = false;

        System.out.println("x && y: " + (x && y)); // false
        System.out.println("x || y: " + (x || y)); // true
        System.out.println("!x: " + (!x)); // false
        System.out.println("!y: " + (!y)); // true

        // Combining relational and logical operators
        System.out.println("a < b && b < c: " + (a < b && b < c)); // true
        System.out.println("a > b || b < c: " + (a > b || b < c)); // true
        System.out.println("!(a > b): " + !(a > b)); // true
    }

}
