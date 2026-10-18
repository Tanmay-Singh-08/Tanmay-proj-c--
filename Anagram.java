import java.util.*;
public class Anagram
{
    String str,str1;
    char temp;
    public void accept()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter 2 words to check if they are anagram");
        str=sc.nextLine();
        str1=sc.nextLine();
    }
    public void checkAnagram()
    {
        for(int i=0;i<str.length();i++)
        {
            for(int j=0;j<str.length()-1-i;j++)
            {
                if(str.charAt(j)>str.charAt(j+1))
                {
                    temp=str.charAt(j);
                    str.charAt(j)=str.charAt(j+1);
                    str.charAt(j+1)=temp;
                }
            }
        }
        for(int k=0;k<str1.length();k++)
        {
            for(int l=0;l<str1.length()-1-k;l++)
            {
               if(str.charAt(l)>str.charAt(l+1))
               {
                   temp=str.charAt(l);
                   str1.charAt(l)=str.charAt(l+1);
                   str.charAt(l+1)=temp;
               }
            }
        }
    }
}