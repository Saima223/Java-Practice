package Arrays;

public class JageddArr {
    public static void main(String[] args) {
        // Declare a jagged array with 3 rows
        int[][] jaggedArray = new int[3][];

        // Initialize the jagged array with different lengths for each row
        jaggedArray[0] = new int[3]; // First row has 3 elements
        jaggedArray[1] = new int[2]; // Second row has 2 elements
        jaggedArray[2] = new int[4]; // Third row has 4 elements

        // Fill the jagged array with values
        int value = 1;
        for (int i = 0; i < jaggedArray.length; i++) {
            for (int j = 0; j < jaggedArray[i].length; j++) {
                jaggedArray[i][j] = value++;
            }
        }

        // Print the jagged array
        System.out.println("Jagged array elements:");
        for (int i = 0; i < jaggedArray.length; i++) {
            for (int j = 0; j < jaggedArray[i].length; j++) {
                System.out.print(jaggedArray[i][j] + " ");
            }
            System.out.println();
        }
    }

}
