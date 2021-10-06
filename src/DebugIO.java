import java.util.Scanner;

public class DebugIO {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String name, age;
        int dob;

        System.out.println("Input your name: ");
        name = input.nextLine();

        System.out.println("Enter your age: ");
        age = input.nextLine();

        System.out.println("Enter your DOB year: ");
        dob = input.nextInt();

        System.out.println("Summary: your ");

    }
}
