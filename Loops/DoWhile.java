package Loops;

public class DoWhile {
    public static void main(String[] args) {
        int row = 1;

        do {
            int col = 1;
            do {
                System.out.print(row * col + "\t");
                col++;
            } while (col <= 10);
            System.out.println();
            row++;
        } while (row <= 10);
    }
    
}
