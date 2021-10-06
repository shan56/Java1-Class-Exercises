/*
Ask the user for an array size. Generate random numbers between 0 and 10 and
then save them into the array. Then print out the original random numbers along with
their mean, mode, and median number.

Hint:
The mean is the average of a data set.
The mode is the most common number in a data set.
The Median is the middle of the set numbers. If you have an even set of numbers,
average the middle two to find the median.
 */

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Module4MeanMedianMode {
    public static void main(String args[]) {
        int numbers[], origNumbs[], sz;
        int count= 0, maxCount=0, modeValue=0;
        double total = 0.0;
        Scanner keybd = new Scanner(System.in);
        Random rand = new Random();

        System.out.print("How many number would you like to generate? ");
        sz = keybd.nextInt();

        numbers = new int[sz];
        for (int i = 0; i < sz; i++){
            numbers[i] = rand.nextInt(10);
            total += numbers[i];
        }

        origNumbs = Arrays.copyOf(numbers, sz);
        Arrays.sort(numbers);

        System.out.println("Original Numbers:");
        System.out.println(Arrays.toString(origNumbs));
        System.out.println("Sorted Numbers:");
        System.out.println(Arrays.toString(numbers));

        // mean
        System.out.printf("Mean: %.2f\n", total/sz);

        // median
        if (sz % 2 == 1)
            System.out.printf("Median: %d\n", numbers[sz/2]);
        else {
            int j = sz/2;
            System.out.printf("Median: %.2f\n", (numbers[j-1] + numbers[j])/2.0);
        }

        // mode
        for (int i = 0; i < sz; i++) {
            count = 0;
            for (int j = 0; j < sz; j++) {
                if (numbers[i] == numbers[j])
                    count++;
            }
            if (count > maxCount) {
                maxCount = count;
                modeValue = numbers[i];
            }
        }
        System.out.printf("Mode: %d appeared %d times\n", modeValue, maxCount);

    }
}
