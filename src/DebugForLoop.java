/*
The program is supposed to add 8, 6, 4, & 2 using for loop.
But it has several bugs. Can you fix them?
 */

import java.util.Scanner;

public class DebugForLoop {
    public static void main(String args[]){
        // original code
        /*
        int i = 0;
        for (int i = 8; i > 0; i =- 2) {
            sum += i;
        }

        System.out.println("Sum=" + i);
*/

        /*****  solution

        int sum = 0;

        for (int i = 8; i > 0; i-=2) {
            sum += i;      // sum = sum + i
        }

        System.out.println("Sum=" + sum);

         *****/
    }
}
