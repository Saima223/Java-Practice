public class Stackk {

    public static void main(String[] args) {
        int a = 5; // variable 'a' is stored on the stack

        int result = calculateSum(a, 3); // method call, creating a new stack frame

        System.out.println("Result: " + result);
    }

    public static int calculateSum(int x, int y) {
        int sum = x + y; // variables 'x', 'y', and 'sum' are stored on the stack
        return sum; // sum is returned, stack frame is popped off
    }
}
