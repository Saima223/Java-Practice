package Loops;

public class ForLoop {
    public static void main(String[] args) {
        int rows = 10; // number of rows in the multiplication table
        int columns = 10; // number of columns in the multiplication table

        // outer loop for rows
        for (int i = 1; i <= rows; i++) {
            // inner loop for columns
            for (int j = 1; j <= columns; j++) {
                // print the product of i and j with a space after each number
                System.out.print(i * j + " ");
            }
            // new line after each row
            System.out.println();
        }
    }

}
