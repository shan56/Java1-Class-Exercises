import java.util.Scanner;

public class DebugConditional {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);;
        int testscore;
        char grade;

        System.out.println("Enter a test score: ");
        testscore = input.nextInt();

        if (testscore >= 90)
            grade = 'A';
        else if (testscore >= 80)
            grade = 'B';
        else if (testscore >= 70)
            grade = 'C';
        else if (testscore >= 60)
            grade = 'D';
        else
            grade = 'F';


        System.out.println("Grade = " + grade);
    }
}
