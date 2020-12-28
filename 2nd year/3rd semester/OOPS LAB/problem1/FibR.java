
import java.util.*;

class FibR
{
static int fibonacci(int n)
{
    if (n <= 1) { return 0;}
   if (n == 2) { return 1;}
   int value = fibonacci(n - 1) + fibonacci(n - 2);
    return value;
   
}
public static void main(String args[])
{
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter fibonacci value");
    String output = "";
    int input  = sc.nextInt();
    for(int i = 1 ; i <= input ; i++)
    {
      output += fibonacci(i) + " ";
    }
    System.out.println(output);
sc.close();

}
}
