import java.util.*;
public class employ
{
    double basic,da,hra,pf,net,gp;
    String empn;
    public void input()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Employee name and basic salary");
        empn=sc.nextLine();
        basic=sc.nextInt();
    }
    public void calculate()
    {
        da=(25/100)*basic;
        hra=(15/100)*basic;
        pf=(8.33/100)*basic;
        net=basic+da+hra;
        gp=net-pf;
    }
    public void display()
    {
      System.out.println("Name of the employee" +empn);
      System.out.println("Gross pay=Rs." +gp);
      System.out.println("Net pay=Rs." +net);
    }
    public static void main(String [] args)
    {
        employ obj=new employ();
        obj.input();
        obj.calculate();
        obj.display();
    }
      
      
}