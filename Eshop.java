import java.util.*;
public class Eshop
{
    String name;
    double price,amt;
    double  discount;
    public void accept()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Welcome to Eshop!! Kindly enter the name of your product");
        name=sc.nextLine();
        System.out.println("Enter the cost of the product to receive a discount");
        price =sc.nextDouble();
    }
    public void calculate()
    {
        if(price<1000)
        {
            discount=0;
            amt=price;
        }
        else if(price>=1000 && price<=25000)
        {
            discount=5;
            amt=price*0.95;
        }
        else if(price>=25001 && price<=57000)
        {
            discount=7.5;
            amt=price*0.925;
        }
        else if(price>=57001 && price <=100000)
        {
            discount=10;
            amt=price*0.90;
        }
        else if(price>=100001)
        {
            discount=15;
            amt=price*0.85;
        }
    }
    public void display()
    {
        System.out.println("Name of the item: "+name);
        System.out.println("Cost of the product: "+price);
        System.out.println("Discount on the product purchased: "+discount+"%");
        System.out.println(" Your total amount is: "+amt);
    }
    public static void main(String [] args)
    {
        Eshop obj=new Eshop();
        obj.accept();
        obj.calculate();
        obj.display();
    }
}