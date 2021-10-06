import java.util.Scanner;

public class Example2Conditional {
    public static void main(String[] args) {
        int x = 7;
        int y = 3;
        int z = 0;
        Scanner keybd = new Scanner(System.in);

        boolean status = true;

        if (x == 7)        // either you execute line 8 or you don't based on the condition
            z = 5;
        y = 6;

        System.out.printf("x = %d, y = %d, z = %d\n",x,y,z);


        status = false;

        if (status)
            System.out.println("I got this!");

        System.out.println("This line is printed regardless\n\n");



        if (status)
            System.out.println("I got this!");
        else
            System.out.println("I didn't get this!");

        System.out.printf("status is %b\n", status);


        System.out.println("Enter a whole number: ");
        y = keybd.nextInt();
        if (y % 2 == 0) {
            System.out.printf("%d is even\n", y);
            System.out.println();
        }
        else
            System.out.printf("%d is odd\n", y);


    }
}
