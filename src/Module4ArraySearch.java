import java.util.Arrays;

public class Module4ArraySearch {
    public static void main(String args[]) {
        int scores[] = {100, 93, 91, 89, 95};
        int scoresSorted[], lookFor = 99, index;
        boolean found = false;

        for (int score : scores)
            if (score == lookFor)
                found = true;

        System.out.printf("Found %d: %b \n", lookFor, found);

        //* use binarySearch method
        scoresSorted = Arrays.copyOf(scores, scores.length);
        Arrays.sort(scoresSorted);

        index = Arrays.binarySearch(scoresSorted, lookFor);
        System.out.printf("index=%d\n", index);
        if (index >= 0)
            System.out.printf("scoresSorted[%d]=%d\n", index, scoresSorted[index]);
        else
            System.out.println(lookFor + " not found");
        //*/

        // toString() method
        //*
        String msg = Arrays.toString(scores);
        System.out.println("msg="+msg);
        System.out.println("msg[0]="+msg.charAt(0));

        String temp[] = null;
        System.out.println(Arrays.toString(temp));
        System.out.println("---");

         //*/
    }
}
