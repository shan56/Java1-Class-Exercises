import java.util.Scanner;

public class Module3ForLoop2 {
    public static void main(String args[]){
        int score, numbOfScores;
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter the number of scores: ");
        numbOfScores = keyboard.nextInt();

        for (int i = 0; i < numbOfScores ; i++) {
            System.out.println("What is student's test score? ");
            score = keyboard.nextInt();

            if (score >= 60)
                System.out.println("Student passed.");
            else
                System.out.println("Student failed.");
        }
    }
}
