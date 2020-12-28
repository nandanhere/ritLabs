import java.util.*;
public class SP3
{

public static void main(String args[])
 {
Scanner sc = new Scanner(System.in);
System.out.println("Enter the string");
String s = sc.nextLine();
System.out.println("Enter the substring");
String sub = sc.nextLine();
System.out.println("Enter the replacement");
String rep = sc.nextLine();
String newstr = s.replaceAll(sub,rep);
System.out.println("New String is: " + newstr);
}
}
