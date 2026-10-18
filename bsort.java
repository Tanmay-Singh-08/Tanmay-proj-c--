import java.util.*;
public class bsort
{
    int num;
    int arr[]=new int[10];
    public void input()
    {
        Scanner sc=new Scanner(System.in);
        for(int i=0;i<arr.length;i++)
        {
            System.out.print("Enter 10 integers");
            arr[i]=sc.nextInt();
        }
    }
     public void sort()
     {
         for(int i=0;i<arr.length-1;i++)
         {
             for(int j=0;j<arr.length-1-j;j++)
             {
                 if(arr[i]>arr[i+1])
                 {
                     num=arr[i];
                     arr[i]=arr[i+1];
                     arr[i+1]=num;
                 }
             }
         }
     }
    public void display()
    {
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(+arr[i]+ " ,");
        }
    }
    public static void main(String [] args)
    {
        bsort obj=new bsort();
        obj.input();
        obj.sort();
        obj.display();
    }
}