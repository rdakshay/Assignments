import java.util.Scanner;
class LargestNumber
{
public static void main(String args[])
{
int a,b,c,largest;
Scanner v=new Scanner(System.in);
System.out.println("Enter the first Number:");
a=v.nextInt();
System.out.println("Enter the Second Number:");
b=v.nextInt();
System.out.println("Enter the Third Number:");
c=v.nextInt();
largest=c>(a>b?a:b)?c:((a>b)?a:b);
System.out.println("the LargestNumber is:" +largest);
}
}