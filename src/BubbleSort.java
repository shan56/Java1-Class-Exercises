/*
Write a program to ask the user to enter a starting number and ending number.

Then,
1. create an array of size 10
2. randomly fill the array using starting and ending number user provided
3. sort the array using the bubble sort technique
4. print original and sorted array
 */

import java.util.Scanner;

public class BubbleSort {
    public static void main(String args[])
    {
        int sz, i, j, temp;
        int arr[] = new int[10];
        Scanner keybd = new Scanner(System.in);

        System.out.print("Enter 10 numbers: ");
        sz = 10;

        for(i=0; i<10; i++)
        {
            arr[i] = keybd.nextInt();
        }

        System.out.print("Sorting Array using Bubble Sort Technique...\n");
        for(i=0; i<(sz-1); i++)
        {
            for(j=0; j<(sz-i-1); j++)
            {
                if(arr[j] > arr[j+1])
                {
                    temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }

        System.out.print("Array Sorted Successfully..!!\n");

        System.out.print("Sorted List in Ascending Order : \n");
        for(i=0; i<sz; i++)
        {
            System.out.print(arr[i]+ "  ");
        }
    }
}
