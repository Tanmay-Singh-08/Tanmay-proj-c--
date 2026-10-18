import java.util.*;
public class marks
{
    int[]marks=new int[5];
    int sum;
    int i=0;
    double avg;
    public void input()
    {
        Scanner sc=new Scanner(System.in);
        for(int i=0;i<5;i++);{
            marks[i]=sc.nextInt();
            System.out.println("Enter the marks");
            
        }
        
    }
    public void calculate()
    {
        sum=sum+marks[i];
        avg=sum/5.0;
    }
    public void display()
    {
        System.out.println(marks[i]);
        System.out.println(+sum);
        System.out.println(+avg);
        
    }
    public static void main(String [] args)
    {
        marks obj=new marks();
        obj.input();
        obj.calculate();
        obj.display();
        
        
    }
}


        
         
        
        
 