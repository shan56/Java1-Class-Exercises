/*
Test data with
2021    not a leap year
2020    a leap year
2000    a leap year
1900    not a leap lear
 */

import java.util.Scanner;

public class LeapYear {
    public static void main(String args[]) {
        Scanner keybd = new Scanner(System.in);
        int year;

        System.out.println("Enter a year: ");
        year = keybd.nextInt();

        if ((year % 4) == 0) {
            // year is divisible by 4
            if ((year % 100) == 0)
                // year is divisible by 4 and 100
                if ((year % 400) == 0)
                    // year is divisible by 4, 100, and 400
                    System.out.printf("%d is a leap year\n", year);
                else
                    // year is divisible by 4, 100 but not by 400
                    System.out.printf("%d is not a leap year\n", year);
            else
                // year is divisible by 4 but not by 100
                System.out.printf("%d is a leap year\n", year);
        }
        else
            System.out.printf("%d is not a leap year\n", year);

    }
}
