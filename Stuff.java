import java.util.*;
public class Stuff
{
    int math,phy,chem,bio;
    double avg;
    public void input()
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Marks obtained in mathematics");
        math=sc.nextInt();
        System.out.print("Enter Marks obtained in Physics");
        phy=sc.nextInt();
         System.out.print("Enter Marks obtained in Chemistry");
        chem=sc.nextInt();
         System.out.print("Enter Marks obtained in Biology");
        bio=sc.nextInt();
    }
    public void clalculate()
    {
        avg=(math+phy+bio+chem)/4;
        System.out.println("Your average marks for maths and science is" +avg);
    }
    public void Recommend()
    {
        if(avg>=90)
        {
            System.out.println("Recommended stream for you:Science");
        }
        else if(avg<90 && avg>70)
        {
            System.out.println("Recommended stream for you:Commerce");
        }
        else if(avg<70 && avg>50)
        {
            System.out.println("Recommended stream for you:ARTS");
        }
        else
        {
            System.out.println("Sorry! You failed try again next time.");
        }
    }
    public static void main(String [] args)
    {
        Stuff obj=new Stuff();
        obj.input();
        obj.clalculate();
        obj.Recommend();
    }
}