import java.util.*;
public class NumDude
{
    int num,tempnum,sum,digit,x;
    public void input()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number");
        num=sc.nextInt();
    }
    public void calculate()
    {
        num=tempnum;
        while(tempnum>0)
        {
            
                digit=tempnum%10;
                
                sum+=digit;
                tempnum=tempnum%10;
        }
    }
    public void display()
    {
        if(sum*sum*sum==num)
        {
          System.out.print(+num+ " is a dudeney number");  
        }
        else
        {
            System.out.print(+num+ " Is not dudeney");
        }
    }
    public static void main(String [] args)
    {
        NumDude obj=new NumDude();
        obj.input();
        obj.calculate();
        obj.display();
    }
}