import java.util.*;
public class Largest
{
    double x,y,z,l;
    public void input()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the 3 numbers");
        x=sc.nextDouble();
        y=sc.nextDouble();
        z=sc.nextDouble();
    }
    public void calculate()
    {
        if(x>=y && x>=z)
        {
            l=x;
        }
        else if(y>=x && y>=z)
        {
            l=y;
        }
        else
        {
            l=z;
        }
    }
    public void display()
    {
        System.out.println("The greatest of the three numbers is "+l);
    }
    public static void main(String [] args)
    {
        Largest obj=new Largest();
        obj.input();
        obj.calculate();
        obj.display();
    }
}