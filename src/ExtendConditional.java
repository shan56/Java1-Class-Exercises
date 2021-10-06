/*
The code given takes three numbers from the user and prints out the greatest number.

Test Data
Input the 1st number: 25
Input the 2nd number: 78
Input the 3rd number: 87

Exercise:

Include in the code below the following calculations:

Sum of all three numbers
Number 1 divided by Number 3
Number 2 multiplied by Number 2
 */

import java.util.Scanner;

public class ExtendConditional {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num1, num2, num3, total;

        System.out.print("Input the 1st number: ");
        num1 = in.nextInt();

        System.out.print("Input the 2nd number: ");
        num2 = in.nextInt();

        System.out.print("Input the 3rd number: ");
        num3 = in.nextInt();

        if (num1 > num2) {
            if (num2 > num3){
                // num1 > num2 > num3
                System.out.println("The greatest: " + num1);
            }
            else if (num1 > num3){
                // num1 > num2
                // num1 > num3
                System.out.println("The greatest: " + num1);
            }
            else {
                // num1 > num2
                // num2 <= num3
                // num1 <= num3
                System.out.println("The greatest: " + num3);
            }
        }
        else {
            // num1 <= num2
            if (num2 > num3)
                System.out.println("The greatest: " + num2);
            else {
                // num1 <= num2 <= num3
                System.out.println("The greatest: " + num3);
            }
        }


/*
Sum of all three numbers
Number 1 divided by Number 3
Number 2 multiplied by Number 2
 */
        System.out.printf("%d + %d + %d = %d\n", num1, num2, num3, (num1+num2+num3));
        //System.out.println("%d/%d = %.2f\n", num1, num3, (num1/num3));
    }
}
