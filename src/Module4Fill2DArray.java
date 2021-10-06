import java.util.Scanner;

public class Module4Fill2DArray {
    public static void main(String args[])
    {
        int row, col, i, j;
        String arr[][];
        Scanner keybd = new Scanner(System.in);

        System.out.print("Enter Number of Row for Array: ");
        row = keybd.nextInt();
        keybd.nextLine();
        System.out.print("Enter Number of Column for Array: ");
        col = keybd.nextInt();
        keybd.nextLine();

        arr = new String[row][col];
        System.out.print("Enter " +(row*col)+ " Array Elements : ");
        for(i=0; i<row; i++)
        {
            for(j=0; j<col; j++)
            {
                arr[i][j] = keybd.nextLine();
            }
        }

        System.out.println("\nThe Array is :");
        for(i=0; i<row; i++)
        {
            for(j=0; j<col; j++)
                System.out.print(arr[i][j]+ "  ");

            System.out.println();
        }



        System.out.print("Enter Number of Row for Array: ");
        row = keybd.nextInt();
        keybd.nextLine();
        System.out.print("Enter Number of Column for Array: ");
        col = keybd.nextInt();
        keybd.nextLine();

        arr = new String[row][col];
        System.out.print("Enter " +(row*col)+ " Array Elements : ");
        for(i=0; i<col; i++)
        {
            for(j=0; j<row; j++)
            {
                arr[j][i] = keybd.nextLine();
            }
        }

        System.out.println("\nThe Array is :");
        for(i=0; i<row; i++)
        {
            for(j=0; j<col; j++)
                System.out.print(arr[i][j]+ "  ");

            System.out.println();
        }
    }
}
