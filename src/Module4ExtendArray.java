import java.util.Scanner;

public class Module4ExtendArray {
    public static void main(String args[]) {
        int numList[], size, total=0;
        Scanner keybd = new Scanner(System.in);

        //* building dynamic array
        System.out.println();
        System.out.println("Enter a number of scores: ");
        size = keybd.nextInt();
        numList = new int[size];
        for (int cnt = 0; cnt < numList.length; cnt++) {
            System.out.println("Enter a score: ");
            numList[cnt] = keybd.nextInt();
        }

        for (int item : numList)
            total += item;

        System.out.printf("Sum: %.0f\n", total);
    }
}
