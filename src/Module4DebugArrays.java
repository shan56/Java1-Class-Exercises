public class Module4DebugArrays {
    public static void main(String[] args) {


        // Create an array to hold the numbers 1-10.
        int numList[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        for (int i = 0; i < 10; i++) {
            System.out.println(numList[i]);
        }


        // Loop through that array and sum the numbers 1-10, then print that total to the screen.
        int total = 0;
        for (int i = 0; i < 10; i++) {
            total = total + numList[i];
        }

        System.out.println("The total of the numbers is " + total);
    }
}
