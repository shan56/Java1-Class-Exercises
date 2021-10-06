import java.util.Arrays;

public class Module4ArrayEquals {
    public static void main(String args[]) {
    int scores[] = {100, 93, 91, 89, 95};
    int scoresA[], scoresB[];

    scoresA = Arrays.copyOf(scores, 3);
    System.out.println("Compare with scoresA: " + Arrays.equals(scores, scoresA));

    scoresB = Arrays.copyOf(scores, scores.length);
    System.out.println("Compare with scoresB: " + Arrays.equals(scores, scoresB));



}
}
