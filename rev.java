import java.util.*;
public class rev
{
    String str;
    public void input()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a word");
        str=sc.nextLine();
    }
    public void revNum()
    {
       for(int i=str.length()-1;i>=0;i--)
       {
           char c =str.charAt(i);
           System.out.print(c);
       }
    }
    public static void main(String [] args)
    {
        rev obj=new rev();
        obj.input();
        obj.revNum();
    }
}