import java.util.*;
class SP1
{
static public void problem1()
{
Scanner sc = new Scanner(System.in);
System.out.println("Enter the string");
String s = sc.nextLine();
System.out.println("Enter the index to start the substring,then the length till which the string must extend to");
int n = sc.nextInt();
int n2  = sc.nextInt();
if(n2 >= s.length() || n > n2) 
System.out.println("Invalid Substring");
else
System.out.println("Substring is " + s.substring(n,n2));

}
static public void problem2()
{Scanner sc = new Scanner(System.in);
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
static public void problem3and4()
{Scanner sc = new Scanner(System.in);
System.out.println("Enter the string");
String s = sc.nextLine();
System.out.println("Enter the substring");
String sub = sc.nextLine();
System.out.println("Enter the replacement");
String rep = sc.nextLine();
String newstr = s.replaceAll(sub,rep);
System.out.println("New String is: " + newstr);}

static public void problem5()
{Scanner sc = new Scanner(System.in);
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

        System.out.println(new String(a));}

public static void main(String args[])
 {
  problem1();
  problem2();
problem3and4();
problem5();
 }



}
