

 import java.util.*;
 
public class PC {
    
static boolean isPrime(int number)
{
   var i = Math.round(Math.sqrt(number));
   System.out.println("Enter value to check if prime" + number);

   while(i > 2)
   {
       if(  number % 2 == 0)
       {
           return false;
       }
       i -= 1;
   }
   return true;
}
public static void main(String args[])
{
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter value to check if prime");
     int input  = sc.nextInt();
    if(isPrime(input))
    {
        System.out.println(input + " is Prime");
    }
    else
    {
        System.out.println(input + " is not prime");
    }
sc.close();


}
}
