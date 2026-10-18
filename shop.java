import java.util.*;
public class shop
{
    double cost,discount,amt;
    String name;
    long mobno;
    
    public void input()
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter your name");
      name=sc.nextLine();
      System.out.println("Enter your mobile number");
      mobno=sc.nextLong();
      System.out.println("Enter the cost of your product");
      cost=sc.nextDouble();
    }//End input method :)
    public void calculate()
    {
        if(cost<=10000)
        {
            discount=cost*0.05;
            amt=cost-discount;
        } 
         else if(cost>10000 &&cost<=20000)
        {
            discount=cost*0.10;
            amt=cost-discount;
        }
        else if(cost>20000 && cost<30000)
        {
            discount=cost*0.15;
            amt=cost-discount;
        }
        else
        {
            discount=cost*0.20;
            amt=cost-discount;
        }//end calculate method :)
    }
   public void display()
   {
       System.out.println("Name:" +name);
       System.out.println("mobile number:" +mobno);
       System.out.println("cost:"+cost);
       System.out.println("discount:"+discount);
       System.out.println("Your total amount is" +amt);
   }//End display Method
public static void main(String args[])
{
   shop obj=new shop();
    obj.input();
    obj.calculate();
    obj.display();
   
}//End Main Method
}
