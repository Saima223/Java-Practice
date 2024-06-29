package Arrays;

import java.util.Random;

public class RandomArray {
    public static void main(String[] args) {
        int size = 10;

        // Declare and initialize the array
        int[] randomNumbers = new int[size];

        // Create an instance of the Random class
        Random random = new Random();

        // Fill the array with random numbers
        for (int i = 0; i < size; i++) {
            randomNumbers[i] = random.nextInt(100); // Generates a random number between 0 and 99
        }

        // Print the array elements
        System.out.println("Random array elements:");
        for (int i = 0; i < size; i++) {
            System.out.print(randomNumbers[i] + " ");
        }
    }

}
