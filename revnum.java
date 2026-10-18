import java.util.*;
public class revnum
{
    int num,digit,tempnum,rev;
    public void display()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number to receive the reversed number");
        num=sc.nextInt();
    }
    public void findRev()
    {
      tempnum=num;;
      while(tempnum>0)
      {
          digit=tempnum%10;
          rev=(rev*10)+digit;
          tempnum=tempnum/10;
      }
      System.out.println("The reverse of the number "+num+" is "+rev);
    }
    public static void main(String [] args)
    {
        revnum obj=new revnum();
        obj.display();
        obj.findRev();
    }
}        
            
        
    
