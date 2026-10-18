import java.util.*;
public class Convert
{
    int n,d,m,y;
    
    public void Accept()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the day of the year");
        n=sc.nextInt();
        System.out.println("Enter the year");
        y=sc.nextInt();
        
        
    }
    public void day_to_date()
    {
        int [] monthday={0,31,28,31,30,31,30,31,30,31,30,31,30};
        if(y%4==0)
        {
        monthday[2]=29;    
        }
        int month=1;
        while(n>monthday[month])
        {
            n-=monthday[month];
            month++;
        }
        m=month;
        d=n;
    }
    
        public void display()
        {
        String []month={"","January","February","March","April","May","June","July","August","September","October","November","December"};
        }
        System.out.println("Date:"+month[m] +d+"," +y);
    }   
    
    
    }
}