import java.util.Scanner;

public class Module3DoWhileLoop1 {
    public static void main(String args[]){
        int index = 1;
        //Scanner keyboard = new Scanner(System.in);

        do {
            System.out.println("index = " + index++);
        } while (index <= 5);

        System.out.println("After do-while loop");
        System.out.println("index = " + index);
    }
}
