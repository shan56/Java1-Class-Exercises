/*
Your friend is working on a program that asks the user for an array size. Then the program
will generate random numbers between 30 and 40 and then save them into the array.

Finally, the program prints out the original numbers and sorted numbers. However,
your friend hit the wall and can not seem to fix errors. Can you help?
*/


import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Module4RandomNumbersArray {
    public static void main(String args[]) {
        int numbers[], origNumbs[], sz;
        Scanner keybd = new Scanner(System.in);
        Random rand = new Random();

        System.out.print("How many number would you like to generate? ");
        sz = keybd.nextInt();

        numbers = new int[sz];
        for (int i = 0; i < sz; i++) {
            numbers[i] = rand.nextInt(11)+30;
        }

        origNumbs = Arrays.copyOf(numbers, sz);
        Arrays.sort(numbers);

        System.out.println("Original Numbers:");
        System.out.println(Arrays.toString(origNumbs));
        System.out.println("Sorted Numbers:");
        System.out.println(Arrays.toString(numbers));
    }
}
