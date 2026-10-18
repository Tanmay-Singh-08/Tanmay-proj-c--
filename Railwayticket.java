import java.util.*;
public class Railwayticket
{
 String name,coach,Ac1,Ac2,nonAc;
 double  dist,price;
 public void accept()
 {
     Scanner sc=new Scanner(System.in);
     System.out.println("Enter Your Name");
     name=sc.nextLine();
     System.out.println("Enter the name of coach");
     coach=sc.nextLine();
     System.out.println("Enter the distance travelled in km");
     dist=sc.nextDouble();
 }
 public void calculate()
 {
     if(coach==Ac1)
     {
     price=180*dist;
    }
     else if(coach==Ac2)
     {
     price=150*dist;
    }
     else{
     price=100*dist;
    }
         
     }
     public void display()
     {
         System.out.println("Total price is=" +price);
     }
     public static void main(String args[])
     {
         Railwayticket obj=new Railwayticket();
         obj.accept();
         obj.calculate();
         obj.display();
         
         
     }
         
     }
     

 
