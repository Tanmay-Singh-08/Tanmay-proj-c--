import java.util.*;
public class replace
{
    String str1;
    public void input()
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a sentence");
        str1=sc.nextLine();
    }
    public void newSentence()
    {
        System.out.println("Your sentence is: "+str1);
        System.out.println("New sentence is: "+str1.replace( "available", "not available"));
    }
    public static void main(String [] args)
    {
        replace obj=new replace();
        obj.input();
        obj.newSentence();
    }
}