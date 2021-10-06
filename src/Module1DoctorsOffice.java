import java.util.Scanner;

public class Module1DoctorsOffice {
    public static void main(String[] args) {
        Scanner keybd = new Scanner(System.in);
        String patientName = "Stacey Manson";
        boolean hasInsurance = false;
        double temp = 102.2;
        int numVisits = 5;

        System.out.println("Patient Details:");
        System.out.println("Name: "+patientName);
        System.out.println("Patient has insurance: "+hasInsurance);
        System.out.println("Body temperature: " + temp);
        System.out.println("Number of visits: " + numVisits);

        System.out.println("\n\n");
        System.out.println("Enter patient's name: ");
        patientName = keybd.nextLine();

        System.out.println("Does patient has insurance? (true/false) ");
        hasInsurance = keybd.nextBoolean();

        System.out.println("Enter patient's temperature: ");
        temp = keybd.nextDouble();

        System.out.println("Enter number of visits: ");
        numVisits = keybd.nextInt();

        System.out.println("Patient Details:");
        System.out.println("Name: "+patientName);
        System.out.println("Patient has insurance: "+hasInsurance);
        System.out.println("Body temperature: " + temp);
        System.out.println("Number of visits: " + numVisits);

    }
}
