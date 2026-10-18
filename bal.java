import java.util.*;
public class bal
{
    double bal,withdraw;
    int accno;
    String name;
    public void accept()
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter your account number");
      accno=sc.nextInt();
      System.out.println("Enter your balance");
      bal=sc.nextDouble();
      System.out.println("Enter withdrawl ammount");
      withdraw=sc.nextDouble(); 
    }
    public void calculate()
    {
        if(bal<withdraw)
        System.out.println("Insufficient funds");
        else
        {
            bal=bal-withdraw;
        }
    }
    public void display()
    {
        System.out.println("Remaining balance="+bal);
    }
    public static void main(String [] args)
    {
      bal obj=new bal();
      obj.accept();
      obj.calculate();
      obj.display();
      
    }
}