import java.util.*;
public class functions
{
    String str1,str2;
    public static void main(String [] args)
    {
        String str1,str2;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter 2 Strings");
        str1=sc.nextLine();
        str2=sc.nextLine();
        str1=str1.toLowerCase();
        str2=str2.toLowerCase();
        System.out.println(str1.startsWith(str2));
        System.out.println(str1.endsWith(str2));
    }
}