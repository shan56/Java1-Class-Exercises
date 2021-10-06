import java.util.Scanner;

public class Module4ReplaceCommonWord {
    public static void main(String args[]) {
        String msgArray[], msg;
        Scanner keybd = new Scanner(System.in);

        System.out.println("Enter your text or 'q' to quit: ");
        msg = keybd.nextLine();
        while (!msg.equals("q")) {
            msgArray = msg.split(" ");

            for (String word : msgArray) {
                if (word.equals("the"))
                    word = "BE";
                System.out.printf("%s ", word);
            }

            System.out.println("\n\n");
            System.out.println("Enter your text or 'q' to quit: ");
            msg = keybd.nextLine();
        }
    }
}
