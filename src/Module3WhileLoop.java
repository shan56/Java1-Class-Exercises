import java.util.Scanner;

public class Module3WhileLoop {
    public static void main(String args[]){
        int index = 1;
        Scanner keyboard = new Scanner(System.in);

        while (index <= 5) {
            System.out.println("index = " + index++);
            //index++;
        }

        System.out.println("After while loop");
        System.out.println("index = " + index);
    }
}
