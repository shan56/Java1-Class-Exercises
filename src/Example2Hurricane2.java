import java.util.Scanner;

public class Example2Hurricane2 {
    public static void main(String[] args) {
        Scanner keybd = new Scanner(System.in);
        int windSpeed;

        System.out.print("How fast was the wind blowing?" );
        windSpeed = keybd.nextInt();

        if (windSpeed >=  155) {
            System.out.println("It was a class 5 hurricane");
            System.out.println("Class 5 is the most severe hurricane");
            System.out.println("Hurricane Katrina was class 5");
        }
        else if ((131 <= windSpeed) && (windSpeed < 155))
            System.out.println("It was a class 4 hurricane");
        else if ((111 <= windSpeed) && (windSpeed < 131))
            System.out.println("It was a class 3 hurricane");
        else if ((96 <= windSpeed) && (windSpeed < 111))
            System.out.println("It was a class 2 hurricane");
        else if ((74 <= windSpeed) && (windSpeed < 96))
            System.out.println("It was a class 1 hurricane");
        else
            System.out.println("Get over it. That was not a hurricane");

    }
}
