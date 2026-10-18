import java.io.*;
public class strpal
{
    String word,rev;
    public void input()
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter a word");
        try
        {
            word=br.readLine();
        }
        catch (IOException ioe)
        {
            ioe.printStackTrace();
        }
    }
    public void rev()
    {
        for(int i=word.length();i>=0;i--)
        {
            
        }
        System.out.println(rev);
    }
    public void display()
    {
            if(word.equals(rev))
        {
            System.out.println(word+ "is palindrome");
        }
        else
        {
          System.out.println("Word is not palindrome");  
        }
    }
        
    public static void main(String [] args)throws IOException
    {
        strpal obj=new strpal();
        obj.input();
        obj.rev();
        obj.display();
    }
}