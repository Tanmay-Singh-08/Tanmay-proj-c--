import java.util.*;
public class avg
{
    int arr[]=new int[10];
    int Sum;
    int Avg;
    public void input()
    {
        Scanner sc=new Scanner(System.in);
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=sc.nextInt();
        }
    }
    public void calculate()
    {
        int sum;
        for(int i=0;i<arr.length;i++)
        {
             Sum+=arr[i];
        }
        double Avg=(double) Sum/10;
    }
    public void display()
    {
       System.out.println("Average of the array is"+Avg); 
    }
    public static void main(String [] args)
    {
        avg obj=new avg();
        obj.input();
        obj.calculate();
        obj.display();
    }
}