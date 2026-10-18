import java.util.*;
public class Dirium
{
    int num,digit,prod,l;
    public void input()
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("Kindly enter a number");
      num=sc.nextInt();
    }
    public void calculate()
    {
        while(num>0)
        {
            digit=num%10;
            num=num/10;
            l++;
            prod+=(int)Math.pow(digit,l);
        }
        
    }
    public void display()
    {
        if(prod==num)
        {
            System.out.println("number is Dirium");
        }
        else
        {
            System.out.println("Number is not dirium");
        }
    }
    public static void main(String[] args)
    {
        Dirium obj=new Dirium();
        obj.input();
        obj.calculate();
        obj.display();
    }
}       
        
        
        
    
