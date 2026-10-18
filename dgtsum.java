import java.util.*;
public class dgtsum
{
    int num,digit,sum,tempnum;
    public void accept()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number");
        num=sc.nextInt();
        
            
        }
    public void Calculate()
    {
        while(num!=0)
        {
         digit=num%10;
         num=num/10;
         sum=sum+digit;
         
         
        
        }
        
    }   
     public void display()
     {
         System.out.print("The sum of the digits of the number is"+sum);
     }
    public static void main(String [] args)
    {
        dgtsum obj=new dgtsum();
        obj.accept();
        obj.Calculate();
        obj.display();
    }
    }
