import java.util.*;
public class bubblesort
{
    int arr[]=new int[10];
    public void input()
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter 10 numberz");
      for(int i=0;i<arr.length;i++)
      {
          arr[i]=sc.nextInt();
      }
    }
    public void sort()
    {
        for(int i=0;i<arr.length;i++)
        {
            for(int j=0;j<arr.length-1-i;j++)
            {
                 if (arr[j] > arr[j + 1]) {
                    // Swap numbers[j] and numbers[j + 1]
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
            }
        }
    }
    
}
public void display()
{
    for(int i=0;i<arr.length;i++)
    {
        System.out.print(" , " +arr[i]);
    }
}
public static void main(String[]args)
{
    bubblesort obj=new bubblesort();
    obj.input();
    obj.sort();
    obj.display();
}
}

