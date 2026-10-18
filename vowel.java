import java.util.*;
public class vowel
{
    String str1;
    int count;
    public void input()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a word or a sentence");
        str1=sc.nextLine();
        str1=str1.toLowerCase();
    }
    public void countVowel()
    {
        for(int i=0;i<str1.length();i++)
        {
            char ch=str1.charAt(i);
            if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u') 
            {
                count++;
            }
        }
    }
    public void display()
    {
        System.out.println("There are "+count+" vowels in the sentence");
    }
    public static void main(String [] args)
    {
        vowel obj=new vowel();
        obj.input();
        obj.countVowel();
        obj.display();
    }
}    
 