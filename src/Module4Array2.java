import java.util.Scanner;

public class Module4Array2 {
    public static void main(String[] args) {
        int scores[] = {100, 92, 89, 93, 98, 91, 79, 92, 94, 98};
        double sum = 0.0;


        for (int index = 0; index < scores.length; index++)
            sum += scores[index];


        System.out.printf("Total: %.0f\n", sum);
        System.out.printf("Average: %.2f\n", sum/scores.length);


        //* enhanced for loop example
        //*
        sum = 0;
        for (int item : scores) {
            System.out.printf("item=%d\t", item);
            sum += item;
        }
        System.out.println();

        System.out.printf("Total: %.0f\n", sum);
        System.out.printf("Average: %.2f\n", sum/scores.length);

        //*/


    }
}
