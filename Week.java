import java.lang.*;
import java.util.Scanner;
class Week
{
public static void main(String args[])
{
int s;
Scanner sc=new Scanner(System.in);
System.out.println("enter number from 1 to 7");
int n=sc.nextInt();
switch(n)
{
 case 1:
    System.out.println(" Monday\n");
    break;
 case 2:
    System.out.println("Tuesday\n");
    break;
 case 3:
    System.out.println("Wednesday\n");
    break;
 case 4:
    System.out.println("Thursday\n");
    break;
 case 5:
    System.out.println("friday\n");
    break;
      
 case 6:
    System.out.println("saturday\n");
    break;
 case 7:
    System.out.println("sunday\n");
    break;
}
}
}