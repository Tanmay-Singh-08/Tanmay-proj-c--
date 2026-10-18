import java.util.*;
public class triangles
{ public static void main (String[]args)
    {
    int s1 = 2;
    int s2 = 3;
    int s3 = 44;
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
