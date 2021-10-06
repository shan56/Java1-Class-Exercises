import java.util.Random;

public class Module3RandomNumber {
    public static void main(String args[]){
        Random randomGenerator = new Random();
        int ranNo, min, max;

        for (int i = 1; i <= 10; i++) {
            ranNo = randomGenerator.nextInt(10);  // from 0 to 10, not including 10!
            System.out.println("Generated: " + ranNo);
        }

        System.out.println("Done!\n\n");

        min = 10;
        max = 20;
        for (int i = 1; i <= 10; i++) {
            /*
            want to generate a random number from 10 to 20, both inclusive:
            1. need to generate a random number from 0 to 11, not including 11
            2. then add 10 (min) value to the random number to make it from 10
               to 20, both inclusive
            */
            ranNo = randomGenerator.nextInt(max-min+1) + min;  // from 10 to 21, not including 21!


            System.out.println("Generated: " + ranNo);
        }
    }
}
