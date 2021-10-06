import java.util.Arrays;

public class Module4ArraySort {
    public static void main(String args[]) {
        int scores[] = {100, 93, 91, 89, 95};
        int scoresSorted[];

        scoresSorted = Arrays.copyOf(scores, scores.length);
        Arrays.sort(scoresSorted);

        for (int score : scoresSorted)
            System.out.printf("%d ", score);

        System.out.println();

        scoresSorted = Arrays.copyOf(scores, scores.length);
        Arrays.sort(scoresSorted, 0, 2);

        for (int score : scoresSorted)
            System.out.printf("%d ", score);

        System.out.println();

    }
}
