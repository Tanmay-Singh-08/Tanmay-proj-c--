import java.util.*;
public class Switch
{
    int daynum=0;
    public void input()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number between 0 and 8");
        daynum=sc.nextInt();
    }  
     public void Switch1()
     {
         
         switch(daynum) {
             case 1:
                 System.out.println("Monday");
                 break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                 System.out.println("Wednesday");
                break;
            case 4:
                 System.out.println("Thursday");
                break;
            case 5:
                 System.out.println("Friday");
                break;
            case 6:
                 System.out.println("Saturday");
                break;
            case 7:
                 System.out.println("Sunday");
                break;
            default :
                 System.out.println("Not a day");
                break;
                
         
     }
        
    
}
public static void main(String [] args)
{
    Switch obj=new Switch();
    obj.input();
    obj.Switch1();
}
}