import java.util.Scanner;

public class Module4MultiplyTable {
    static void multipyTable(int value) {
        for (int i = 1; i <= 9; i++)
            System.out.printf("%d x %d = %d\n", value, i, value*i);
    }

    public static void main(String args[]){
        Scanner keybd = new Scanner(System.in);
        int value;
        String answer = "y";

        while (answer.equalsIgnoreCase("y")) {
            System.out.print("Enter a number: ");
            value = keybd.nextInt();
            keybd.nextLine();
            multipyTable(value);
            System.out.println("Do you want to continue? (y/n)");
            answer = keybd.nextLine();
        }
        System.out.println("Bye!");
    }
}
