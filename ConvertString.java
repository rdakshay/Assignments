import java.util.*;
package examples;
public class ConvertString 
{
public static void main(String[] args)
{
String word="b.v.raju college";
System.out.println("Statement Before Converting: \n\n"+word);
// We Need To Convert The Word raju To RAJU
System.out.println("\nStatement After Converting is: ");
System.out.println("-------------------------------");
System.out.println(word.replace("raju","RAJU")); 
}
}
