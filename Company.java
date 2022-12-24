 import java.util.Scanner;
 public class Company
 {
 public static void main(String args[])
 {
 int i,n=0,q=0;
 double avg;
 {
 System.out.println("Input the 5 Numbers:");
 }
 for(i=0;i<5;i++)
 {
 Scanner w=new Scanner(System.in);
 n=w.nextInt();
 q +=n;
 }
 avg=q/5;
 System.out.println("The Sum of 5 no is :"+q+"\nThe Average is:"+avg);
 }
 }