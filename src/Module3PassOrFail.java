import java.util.Scanner;

public class Module3PassOrFail {
    public static void main(String args[]){
        Scanner keybd = new Scanner(System.in);
        int score;

        do{
            System.out.println("Enter a student's test score. Type -1 to quit.");
            score = keybd.nextInt();
            keybd.nextLine();

            if (score >= 60)
                System.out.println("Student passed.");
            else if (score != -1)
                System.out.println("Student failed.");

        } while (score != -1);
    }
}
