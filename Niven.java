import java.util.*;
public class Niven
{
    
    public static void main(String [] args)
    {
        int num,digit;
        int sum=0;
        int tempnum=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number");
         num=sc.nextInt();
        num=tempnum;
        while(tempnum>0)
        {
            digit=tempnum%10;
            sum+=digit;
            tempnum=tempnum/10;
        }
        if(num%sum==0)
        {
            System.out.println("Number is Niven");
        }
        else
        {
            System.out.println("Number is not Niven");
        }
    }
}