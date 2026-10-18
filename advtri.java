import java.util.*;
public class advtri
{
    int s,ss,s3;
    public static void main(String [] args)
    {
        double  s1,s2,s3;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the 3 sides of the triangle");
        s1=sc.nextInt();
        s2=sc.nextInt();
        s3=sc.nextInt();
        if(s1+s2>s3 && s2+s3>s1 && s1+s3>s2)
    {
     System.out.println("itsa triangul");
    }
    else{
    
    System.out.println("its a not triangul");
    
       }
    
    if(s1==s2 && s2==s3)
    {
        System.out.println("it is equilateral trangul");
    }
    else if(s1==s2|| s2==s3 || s1==s3)
    {
    System.out.println("it is isoceles trangul");
    }
     else { System.out.println("scalene trangul");}
    
    }
}
        
        
    
