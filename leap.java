import java.util.*;
public class leap
{
    int year;
    public void checkLeap()
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a year to check if it is a leap year");
        year=sc.nextInt();
        if(year%100==0)
        {
            if(year%400==0)
            {
                System.out.println(year+ " is a century!! leap year");
            }
            else
            {
                System.out.println(year+ " is not a leap year");
            }
        }
        else if(year%4==0)
        {
            System.out.println(year+ " is a leap year");
        }
        else
        {
            System.out.println(year+ " is not a leap year");
        }
        
        
    }
    public static void main(String [] args)
    {
        leap obj=new leap();
        obj.checkLeap();
        
        
        
    }
}