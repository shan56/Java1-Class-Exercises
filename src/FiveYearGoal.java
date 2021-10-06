/*
Robert is working on his 5-year goal - to increase his current $62,000
annual income by 10% each year.

Write a pseudocode in a README.md file, first.
Then, write an application that will calculate his annual income on
the fifth year.
 */


import java.util.Scanner;

public class FiveYearGoal {
    public static void main(String args[]) {
        Scanner keybd = new Scanner(System.in);
        double salary, rate, goal = 0;

        salary = 6200;
        rate = .1;

        System.out.println("current: " + salary);
        salary += (salary * rate);
        System.out.println("1 year later: " + salary);
        salary += (salary * rate);
        System.out.println("2 years later: " + salary);
        salary += (salary * rate);
        System.out.println("3 years later: " + salary);
        salary += (salary * rate);
        System.out.println("4 years later: " + salary);
        salary += (salary * rate);
        System.out.println("5 years later: " + salary);

        System.out.println("\n--------------\n");

        System.out.print("Enter a salary: ");
        salary = keybd.nextDouble();

        System.out.print("Enter a rate in percentage: ");
        rate = keybd.nextDouble();
        rate /= 100;

        System.out.println("current: " + salary);
        salary += (salary * rate);
        System.out.println("1 year later: " + salary);
        salary += (salary * rate);
        System.out.println("2 years later: " + salary);
        salary += (salary * rate);
        System.out.println("3 years later: " + salary);
        salary += (salary * rate);
        System.out.println("4 years later: " + salary);
        salary += (salary * rate);
        System.out.println("5 years later: " + salary);

    }
}
