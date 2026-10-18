import java.util.*;
public class year
{
    int day,Year,month,days;
    public void input()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of days");
        day=sc.nextInt();
    }
    public void calculate()
    {
        Year=day/365;
        month=(day%365)/30;
        days=(day%365)%30;
    }
    public void display()
    {
        System.out.println("Total days "+day);
        System.out.print(" Years "+Year);
        System.out.print(" Months "+month);
        System.out.print(" Days "+days);
    }
    public static void main(String [] args)
    {
        year obj= new year();
        obj.input();
        obj.calculate();
        obj.display();
    }
}