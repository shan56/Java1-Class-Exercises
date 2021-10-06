import java.util.Scanner;

public class HomeWork {
    public static void main(String[] args){
/*  set income to 62,000 (Input income)
    increase income by 10% raise = income * .10 (could also multiply by 1.10
    income = income + raise (Would be easier in a loop)
    and display the final amount
 */
        Scanner input = new Scanner(System.in);

        double income, increase, percent;

        //income = 62000;
        System.out.print("Enter your current income: ");
        income = input.nextDouble();
        System.out.print("Enter your yearly increase: ");
        percent = input.nextDouble();

        //year 1
        increase = income * percent;
        income += increase;
        //We were only asked to display the 5th year so commented the below line
        //System.out.println("Your income after 1 year would be: " +income);
        //year 2
        increase = income * percent;
        income += increase;
        //We were only asked to display the 5th year so commented the below line
        // System.out.println("Your income after 2 years would be: " + income);
        //year 3
        increase = income * percent;
        income += increase;
        //We were only asked to display the 5th year so commented the below line
        //System.out.println("Your income after 3 years would be: " + income);
        //year 4
        increase = income * percent;
        income += increase;
        //We were only asked to display the 5th year so commented the below line
        //System.out.println("Your income after 4 years would be: " + income);
        //year 5
        increase = income * percent;
        income += increase;

        System.out.println("Your income after 5 years would be: " + income);

    }
}
