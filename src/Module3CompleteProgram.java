/*
Below program will ask a user to input a number and then it will print
all numbers from that input value to 1. But it is incomplete.
Complete the program WITHOUT changing any existing code.
 */


import java.util.Scanner;

public class Module3CompleteProgram {
    public static void main(String args[]) {
        int userInput;
        Scanner keybd = new Scanner(System.in);

        System.out.println("Enter a number: ");
        userInput = keybd.nextInt();

        // use for loop
        for (int i=userInput; i > 0; i--)
            System.out.printf("%d ", i);

        System.out.println();

    }


}
