package Arrays;

public class TwoD {
    public static void main(String[] args) {
        // Declare and initialize a 3x3 matrix (2D array)
        int[][] matrix = {
                { 1, 2, 3 },
                { 4, 5, 6 },
                { 7, 8, 9 }
        };

        // Access and print each element of the 2D array using nested for loops
        System.out.println("Matrix elements:");
        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[row].length; col++) {
                System.out.print(matrix[row][col] + " ");
            }
            System.out.println();
        }

        // Modify an element in the 2D array
        matrix[1][1] = 10;

        // Print the modified 2D array
        System.out.println("\nModified matrix elements:");
        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[row].length; col++) {
                System.out.print(matrix[row][col] + " ");
            }
            System.out.println();
        }
    }

}
