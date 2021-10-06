import java.util.Scanner;

public class Example_IO {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String firstName, lastName, hobby;
        int age;
        double height;


        System.out.println("What is your first name?");
        firstName = input.nextLine();

        System.out.println("What is your last name?");
        lastName = input.nextLine();

        System.out.println("Your full name is: " + firstName + " " + lastName);
        System.out.println(lastName + ", " + firstName);

        System.out.println(lastName + " how old are you? ");
        age = input.nextInt();

        System.out.println(lastName + " what is your height?");
        height = input.nextDouble();

        System.out.println("You are " + age + " years old and your height is "+ height);

        System.out.println("What is your hobby?");
        hobby = input.next();
        input.nextLine();

        System.out.println("What was your age?");
        age = input.nextInt();

        System.out.println("Your hobby is " + hobby + " and age is "+ age);

    }
}
