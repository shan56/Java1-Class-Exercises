/*
Write a program to ask the user to enter temperature in Celsius to convert
into Fahrenheit, then display the result on the screen

*/


import java.util.Scanner;

public class Module4ConvertTemp {


    public static void main(String args[]){
        double cen;
        double fah;
        Scanner keybd = new Scanner(System.in);

        System.out.print("Enter Temperature in Centigrade : ");
        cen = keybd.nextDouble();

        fah = (1.8*cen) + 32;

        System.out.print("Equivalent Temperature in Fahrenheit = " + fah);

    }
}
