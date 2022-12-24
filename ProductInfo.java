import java.util.Scanner;
class ProductInfo
{
public static void main(String[] args)
{
Scanner w=new Scanner(System.in);
System.out.println("Programe to display product Information:");
System.out.println("-------------------------------------");
System.out.println("Enter The Product_id");
int a=w.nextInt();
System.out.println("Enter The Product Name");
String b=w.next();
System.out.println("Enter The Product Price");
int c=w.nextInt();
System.out.println("Enter The Product Category");
String d=w.next();
System.out.println("Enter The Brand of the Product");
String e=w.next();
System.out.println("\n\nThe Information about the product you entered is:");
System.out.println("Product_id is:"+a);
System.out.println("Product Name is:"+b);
System.out.println("Product Price is:"+c);
System.out.println("Product Category is:"+d);
System.out.println("Product Brand is:"+e);
}
}