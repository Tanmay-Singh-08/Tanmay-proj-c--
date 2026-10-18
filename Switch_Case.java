import java.util.*;
public class Switch_Case
{ int a,b,ch;
    public void input()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter 2 numbers");
        a=sc.nextInt();
        b=sc.nextInt();
        
    }
    void switchs()
    {
        Scanner sc=new Scanner(System.in);
        ch=sc.nextInt();
        switch(ch)
        {
           case 1:
               System.out.println("Addition="+ (a+b));
               break;
               case 2:
                    System.out.println("Subtraction="+ (a-b));
                    break;
                    case 3:
                         System.out.println("Multiplication="+ a*b);
                         break;
                         case 4:
                              System.out.println("Division="+ (a/b));
                              break;
                              default:
                                  System.out.println("Kindly enter a valid value");
                                  break;
        }
        
            
    }
    public static void main(String[] args)
    {
        Switch_Case obj=new Switch_Case();
        obj.input();
        obj.switchs();
    }
}