
import java.util.*;


public class FibWR {
    public static void main(String args[])
{
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter fibonacci value");
    String output = "";
    int input = sc.nextInt();
    
    sc.close();
    int fib1 = 0 , fib2 = 1,temp;
    for (int i = 1 ; i < input;i++)
    {
        if (i == 1) {        output += fib1 + " ";    }
        if (i == 2) {        output += fib1 + " ";    }
         else
  {         temp = fib2 + fib1;
        output += temp + " ";
        fib1 = fib2;
        fib2 = temp;
 }
        
    }
    System.out.println(output);



}
}
