import java.util.*;
class Complex
{
int real,complex;
Complex(int r, int c)
 {
this.real = r;
this.complex = c;
 
 }
 static void display(Complex c)
 {
  System.out.println("The Complex number is : " + c.real + " + (" + c.complex + ")i");
 }
static void add(Complex n1,Complex n2)
 {
Complex res = new Complex(n1.real + n2.real,n1.complex + n2.complex);
  display(res);
 }
static void subtract(Complex n1,Complex n2)
 {
Complex res = new Complex(n1.real - n2.real,n1.complex - n2.complex);
 display(res);
 }
static void mul(Complex n1,Complex n2)
 {
  System.out.println("the result is " + (n1.real * n2.real) + " + (" + ((n1.real *  n2.complex) + (n1.complex * n2.real)) + ")i - (" + (n1.complex * n2.complex) + ")");
 }

}
class CS{
public static void main(String args[])
{
  Scanner sc = new Scanner(System.in);
  System.out.print("Enter real and imaginary part of first number : ");
 Complex a = new Complex(sc.nextInt(),sc.nextInt());
 Complex.display(a);
 System.out.print("Enter real and imaginary part of Second number : ");
 Complex b = new Complex(sc.nextInt(),sc.nextInt());
 Complex.display(b);
 System.out.println("On adding both");

 Complex.add(a,b);
 System.out.println("On subtracting both");

 Complex.subtract(a,b);
 System.out.println("On multiplying both");

 Complex.mul(a,b);
 sc.close();
}

}
