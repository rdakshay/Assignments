import java.util.Scanner;
class Positive
{
public static void main(String args[]) 
{
Scanner b=new Scanner(System.in);
System.out.println("enter an number to check whether it is positive or not\n");
int a=b.nextInt();
if(a>=0)
{
System.out.println("Your Number is Positive");
}
else
{
System.out.println("Your number is Negative");
}	
}
}