/*
You are building an application for a teacher (user) to create a roster for
a new college class. The teacher should be prompted to:

- Input the number of students that are in his/her class (use Scanner class)
- After number of students are specified, the teacher should be prompted to
  enter each students name, ID number, major and educational department.
- Each student should be saved into an array of students
- Once the teacher is finished inputting the students' information, print the
  roster with all the students entered.

Be sure to include methods in your application.

Challenge: alphabetically print student's name
 */

import java.util.Arrays;
import java.util.Scanner;

public class FinalProjectClassRoster {
    static void get_info(Scanner kb, String matrix[][], int maxNo) {
        for (int idx = 0; idx < maxNo; idx++) {
            System.out.println("Enter student's name: ");
            matrix[idx][0] = kb.nextLine();

            System.out.println("Enter student's id: ");
            matrix[idx][1] = kb.nextLine();

            System.out.println("Enter student's major: ");
            matrix[idx][2] = kb.nextLine();

            System.out.println("Enter student's department: ");
            matrix[idx][3] = kb.nextLine();
        }
    }

    static void print_info(String matrix[][], int maxNo) {
        String names[] = new String[maxNo];

        // create an array of stdent names
        for (int idx = 0; idx < maxNo; idx++) {
            names[idx] = matrix[idx][0];
        }

        // sort student names
        Arrays.sort(names);

        System.out.println();
        System.out.printf("Total number of students: %d\n", maxNo);
        System.out.printf("%20s%10s%10s%10s\n", "NAME", "ID", "MAJOR", "DEPT");
        System.out.println("--------------------------------------------------");

        for (int nameIdx = 0; nameIdx < maxNo; nameIdx++) {
            // for each name in the sorted names array, gather
            // student's information
            for (int idx = 0; idx < maxNo; idx++) {
                if (matrix[idx][0].equalsIgnoreCase(names[nameIdx])) {
                    // found the student
                    System.out.printf("%20s%10s%10s%10s\n", matrix[idx][0], matrix[idx][1], matrix[idx][2], matrix[idx][3]);
                    break;    // break and get next name
                }
            }
        }
    }

    public static void main(String args[]) {
        Scanner keybd = new Scanner(System.in);
        String roster[][];
        int noStudents;

        System.out.println("Enter a number of students: ");
        noStudents = keybd.nextInt();
        keybd.nextLine();
        roster = new String[noStudents][4];

        get_info(keybd, roster, noStudents);
        print_info(roster, noStudents);
    }
}
