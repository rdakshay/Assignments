import java.util.Scanner;
class NaturalNumbers
{
public static void main(String args[])
{
Scanner v=new Scanner(System.in);
System.out.println("Enter an number to display Natural Numbers upto");
int n=v.nextInt();
System.out.println("Natural Number upto "+n+" Are:");
for(int i=1;i<=n;i++)
{
System.out.println(i);
}
}
}

