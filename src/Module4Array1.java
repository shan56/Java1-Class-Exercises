import java.util.Arrays;

public class Module4Array1 {
    public static void main(String[] args) {
        int[] anArray;          // declares an array of integers
        String colors[];        // declares an array of Strings

        anArray = new int[10];  // allocates memory for 10 integers

        anArray[0] = 100;       // initialize first element
        anArray[1] = 200;       // initialize second element
        anArray[2] = 300;       // and so forth
        anArray[3] = 400;
        anArray[4] = 500;
        anArray[5] = 600;
        anArray[6] = 700;
        anArray[7] = 800;
        anArray[8] = 900;
        anArray[9] = 1000;

        System.out.println("Element at index 0: " + anArray[0]);
        System.out.println("Element at index 1: " + anArray[1]);
        System.out.println("Element at index 2: " + anArray[2]);
        System.out.println("Element at index 3: " + anArray[3]);
        System.out.println("Element at index 4: " + anArray[4]);
        System.out.println("Element at index 5: " + anArray[5]);
        System.out.println("Element at index 6: " + anArray[6]);
        System.out.println("Element at index 7: " + anArray[7]);
        System.out.println("Element at index 8: " + anArray[8]);
        System.out.println("Element at index 9: " + anArray[9]);
        System.out.println();

        // example 2
//*
        colors = new String[3];
        colors[0] = "Red";
        colors[1] = "Yellow";
        colors[2] = "Green";

        System.out.println(colors);
        System.out.printf("%d colors are %s, %s, and %s\n", colors.length, colors[0], colors[1], colors[2]);
//*/

        //* example 3
//*
        String days[] = {"Sun", "Mon", "Tue", "Wed", "Thr", "Fri", "Sat"};
        System.out.println(days[0]);

        days[0] = "S";
        System.out.println(days[0]);

        String foo = "test";
        foo = "nope";

        System.out.printf("length of Array days: %d\n", days.length);
//*/
    }
}
