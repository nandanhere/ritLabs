import java.util.*;
class SP2
{

public static void main(String args[])
 {
Scanner sc = new Scanner(System.in);
System.out.println("Enter the string");
String a[] = sc.nextLine().split(" ");
System.out.println("Enter the word to search for ");
String search = sc.nextLine();
int count = 0;
for (int i = 0 ; i < a.length;i++)
{
if(search.equals(a[i]))
   count++;
}

 System.out.println("Occurances of " + search + " :" + count);

}
}
