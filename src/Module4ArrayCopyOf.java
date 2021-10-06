import java.util.Arrays;

public class Module4ArrayCopyOf {
    public static void main(String args[]) {
        int scores[] = {100, 93, 91, 89, 95};
        int scoresA[], scoresB[];
        String msg[] = {"one", "two","three"}, copyMsg[];

        scoresA = Arrays.copyOf(scores, 3);  // {100, 93,91}

        for (int score : scoresA)
            System.out.printf("%d ", score);

        System.out.printf("\nscoresA.length=%d\n", scoresA.length);

        scoresB = Arrays.copyOf(scores, 10);
        for (int score : scoresB)
            System.out.printf("%d ", score);

        System.out.printf("\nscoresB.length=%d\n", scoresB.length);

        copyMsg = Arrays.copyOf(msg, 10);
        for (String item : copyMsg)
            System.out.printf(">>%s<< ", item);

        System.out.printf("\ncopyMsg.length=%d\n", copyMsg.length);


    }
}
