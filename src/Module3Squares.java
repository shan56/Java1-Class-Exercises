import java.util.Scanner;

public class Module3Squares {
    public static void main(String args[]) {
        Scanner keybd = new Scanner(System.in);
        int number;

        System.out.println("Enter a number: ");
        number = keybd.nextInt();

        System.out.println("Number\tSquare");
        System.out.println("---------------");
        for (int i = 1; i <= number; i++) {
            System.out.printf("%d\t\t%d\n", i, (i * i));
        }

    }
}
