import java.util.*;
public class automorphic
{
    int n;
    int sq=n*n;
    int l;
    public void accept()
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number");
        n=sc.nextInt();
    }
    public void calculate()
    {
        int t=n;
        while(t>0)
        {
            t=t/10;
            l++;
        }
    }
    public void display()
    {
      int end=sq% (int)Math.pow(10,l);
    if(n==end)
    {
        System.out.println("Is automorphic");
    }
    else
    {
        System.out.println("Not automorphic");
    }
    }
    public static void main(String [] args)
    {
        automorphic obj=new automorphic();
        obj.accept();
        obj.calculate();
        obj.display();
    }
}