import java.util.*;
public class ArrTwo
{
    
    
    
    public void printArr()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of rows and columns in the array");
        int row=sc.nextInt();
        int col =sc.nextInt();
        int arr[][]=new int [row][col];
        for(int i=0;i<row;i++)
        {
            for(int j=0;j<col;j++)
            {
                 arr[i][j]=sc.nextInt();
            }
        }
        System.out.println("Your array");
        for(int i=0;i<row;i++)
        {
            for(int j=0;j<col;j++)
            {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static void main(String [] args)
    {
        ArrTwo obj=new ArrTwo();
        obj.printArr();
    }
}