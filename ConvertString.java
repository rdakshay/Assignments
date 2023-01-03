import java.*;
public class ConvertString 
{
public static void main(String[] args)
{
String word="rolex from vikram";
System.out.println("Statement Before Converting: \n\n"+word);
// We Need To Convert The Word rolex To ROLEX and vikram To VIKRAM
System.out.println("\nStatement After Converting is: ");
System.out.println("-------------------------------");
System.out.println(word.replace("rolex","ROLEX"));
System.out.println(word.replace("vikram","VIKRAM"));  
}
}