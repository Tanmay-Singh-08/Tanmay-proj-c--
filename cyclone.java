import java.util.*;
public class cyclone
{
    int num,r,digit;
    public void input()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Kindly enter a number");
        num=sc.nextInt();
    }
    public void calculate()
    {
        r=num%10;
        digit=digit/10;
        if(digit==r)
        {
            System.out.println(num+"is cyclone");
        }
        else
        {
            System.out.println(num+"is not cyclone");
        }
    }
    public static void main(String [] args)
    {
        cyclone obj=new cyclone();
        obj.input();
        obj.calculate();
        
    }
}