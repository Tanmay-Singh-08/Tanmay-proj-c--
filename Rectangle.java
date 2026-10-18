import java.util.*;
public class Rectangle
{
    int l,b,ar,p;
    public void input()
    {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the length of the rectangle");
    l=sc.nextInt();
    System.out.println("Enter the bredth of the triangle");
    b=sc.nextInt();
}
public void calculate()
{
    ar=l*b;
    p=2*(l+b);
}
public void display()
{
    System.out.println("Length of the rectagle="+l);
    System.out.println("Bredth of the rectangle"+b);
    System.out.println("Area of the rectangle"+ar);
    System.out.println("perimeter of the rectangle"+p);
}
public static void main(String [] args)
{
    Rectangle obj=new Rectangle();
    obj.input();
    obj.calculate();
    obj.display();
}

    
}

