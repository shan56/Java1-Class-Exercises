/*
1. Write a program that prints all the odd numbers from 1-20.
2. Write a program that prints all the even numbers from 1-20.
3. Write a program to reverse a string.
   For example,  reverse of "Program" is "margorP"
4. Write a program that display all the factors of a number.
   For example, the factors of 10 is 1, 2, 5.
5. Write a program that computes the factorial of a number.
   For example, the factorial of 4 is (4 x 3 x 2 x 1 = 24).
*/

import java.util.Scanner;

public class Module3MoreForLoops {
    public static void main(String args[]) {
        Scanner keybd = new Scanner(System.in);
        String msg;
        int numb, total;

        //1. Write a program that prints all the odd numbers from 1-20.
        System.out.println("Odd numbers from 1-20:");
        for (int i = 1; i <= 20; i++) {
            if (i % 2 == 1)
                System.out.printf("%d ", i);
        }
        System.out.println("\n");

        //2. Write a program that prints all the even numbers from 1-20.
        System.out.println("Even numbers from 1-20:");
        for (int i = 1; i <= 20; i++) {
            if (i % 2 == 0)
                System.out.printf("%d ", i);
        }
        System.out.println("\n");


        //3. Write a program to reverse a string.
        System.out.println("Reverse");
        System.out.println("Enter a string: ");
        msg = keybd.nextLine();
        System.out.println("Reversed string: ");
        for (int i = msg.length(); i > 0; i--) {
            System.out.printf("%c", msg.charAt(i-1));
        }
        System.out.println("\n\n");

        // 4. Write a program that display all the factors of a number.
        //   For example, the factors of 10 is 1, 2, 5.
        System.out.println("Factors");
        System.out.println("Enter a number: ");
        numb = keybd.nextInt();
        System.out.println("Factors of " + numb + ": ");
        for (int i = 1; i < numb; i++) {
            if (numb % i == 0)
                System.out.printf("%d ", i);
        }
        System.out.println("\n");

        //5. Write a program that computes the factorial of a number.
        //   For example, the factorial of 4 is (4 x 3 x 2 x 1 = 24).

        System.out.println("Factorial");
        System.out.println("Enter a number: ");
        numb = keybd.nextInt();
        total = 1;
        for (int i = numb; i > 1; i--) {
            total *= i;
            System.out.printf("%d X ", i);
        }
        System.out.println("1 = " + total);
    }
}
