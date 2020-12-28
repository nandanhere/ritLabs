// program to check if 2 strings are equal ignoring case and to show concatenation of string and sorting of the string
import java.util.*;
class SP5
{

public static void main(String args[])
 {
Scanner sc = new Scanner(System.in);
System.out.println("Enter the string");
String s = sc.nextLine();
System.out.println("Enter the string");
String s2 = sc.nextLine();

if(s.equalsIgnoreCase(s2) != true) 
System.out.println("not equal");
else
System.out.println("Equal");
System.out.println(s + s2);
char a[] = s.toCharArray();
Arrays.sort(a);
        String sorted = new String(a);
        System.out.println(sorted);

 }



}
