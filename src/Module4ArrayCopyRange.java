import java.util.Arrays;

public class Module4ArrayCopyRange {
    public static void main(String args[]) {
        int scores[] = {100, 93, 91, 89, 95};
        int scoresA[], scoresB[];
        String msg[] = {"one", "two","three"}, copyMsg[];

        // from - inclusive & to - exclusive
        scoresA = Arrays.copyOfRange(scores, 1, 3);  //{93, 91}

        for (int score : scoresA)
            System.out.printf("%d ", score);

        System.out.printf("\nscoresA.length=%d\n", scoresA.length);

        scoresB = Arrays.copyOfRange(scores, 3,10);
        for (int score : scoresB)
            System.out.printf("%d ", score);

        System.out.printf("\nscoresB.length=%d\n", scoresB.length);

        copyMsg = Arrays.copyOfRange(msg, 0, 10);  //copyOf()
        for (String item : copyMsg)
            System.out.printf(">>%s<< ", item);

        System.out.printf("\ncopyMsg.length=%d\n", copyMsg.length);
    }
}
