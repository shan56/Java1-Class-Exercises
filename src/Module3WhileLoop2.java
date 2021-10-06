import java.util.Scanner;

public class Module3WhileLoop2 {
    public static void main(String args[]){
        int total = 0, score;
        //double count = 0.0;
        int count = 0;
        String answer = "y";
        Scanner keyboard = new Scanner(System.in);

        while (answer.equals("y")) {
            System.out.println("Enter a score: ");
            score = keyboard.nextInt();
            keyboard.nextLine();
            total += score;
            count++;
            System.out.println("Continue? (y/n)");
            answer = keyboard.nextLine();
        }

        //System.out.printf("Total: %d\tAverage Score: %.2f", total, total/count);
        System.out.printf("Total: %d\tAverage Score: %d\n", total, total/count);

    }
}
