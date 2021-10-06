import java.util.Arrays;

public class Module4TwoDArray {
    public static void main(String args[]) {
        int maxRow = 5, maxCol=10;
        int twoDArray[][] = new int[maxRow][maxCol];

        for (int row=0; row < maxRow; row++) {
            for (int col=0; col < maxCol; col++) {
                twoDArray[row][col] = row * 10 + col;
            }
        }

        // print out the 2D Array
        for (int row=0; row < maxRow; row++) {
            for (int col=0; col < maxCol; col++) {
                System.out.print(twoDArray[row][col] + "\t");
            }
            System.out.println();
        }
    }
}
