import java.util.*;
public class MAX
{
    int arr[]=new int [10];
    int min,max,pos=0,pos1=0;
    public void input()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter 10 numbers");
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=sc.nextInt();
        }
    }    
     public void min()
     {
         min=arr[0];
         for(int i=0;i<arr.length;i++)
         {
             if(arr[i]<min)
             {
                 min=arr[i];
                 pos=i;
             }
         }
     }
    public void max()
    {
        arr[0]=max;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]>max)
            {
                max=arr[i];
                pos1=i;
            }
        }
    }
    public void display()
    {
        System.out.println("The smallest number in the array is "  +min+ "At position "+(pos+1));
        System.out.println("The larget number in the array is "  +max+ "At position "+(pos1+1));
    }
    public static void main(String [] args)
    {
        MAX obj =new MAX();
        obj.input();
        obj.min();
        obj.max();
        obj.display();
    }
}