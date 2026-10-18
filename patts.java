import java.util.*;
public class patts
{
    int n;
    public void input()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number");
        n=sc.nextInt();
    }
    public void printPatt()
    {
        for(int i=1;i<n;i++)
        {
            for(int j=1;j<i;j++)
            {
                if(j%2==0)
                {
                    System.out.print("*");
                }
                else
                {
                    System.out.print("#");
                }
            }
            System.out.println();
        }
    }
    public static void main(String [] args)
    {
        patts obj=new patts();
        obj.input();
        obj.printPatt();
    }
}