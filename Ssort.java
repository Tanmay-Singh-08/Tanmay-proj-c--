import java.util.*;
public class Ssort
{
    int arr[]=new int[10];
    int min,pos;
    public void input()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter 10 integers to sort them");
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=sc.nextInt();
        }
        System.out.println("Unsorted array:");
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(+arr[i]+",");
        }
    }
    public void calculate()
    {
        for(int i=0;i<arr.length-1;i++)
        {
           min=arr[i];
           pos=i;
           for(int j=i;j<arr.length;j++)
           {
               if(min>arr[j])
               {
                   min=arr[j];
                   pos=j;
               }
           }
           int temp=arr[i];
           arr[i]=arr[pos];
           arr[pos]=temp;
        }
        System.out.println("The sorted array is");
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(+arr[i]+",");
        }
    }
    public static void main(String [] args)
    {
        Ssort obj=new Ssort();
        obj.input();
        obj.calculate();
    }
}