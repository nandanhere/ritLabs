import java.util.Scanner;
class Circle { 
   protected  double radius;
   public Circle() {
      radius = 1.0;
   }
   public Circle(double r) {
      radius = r;
   }
   public double getRadius() {
     return radius; 
   }
   public double getArea() {
      return radius*radius*Math.PI;
   }
}
class Sector extends Circle
{
 public double radian;
 public Sector(double radian,double radius)
{
   this.radius = radius;
 this.radian = radian;
}
public double SectorArea()
{
return 0.5 * (radius * radius) * radian;
}
}
class Segment extends Circle
{
 public double length;
  Segment(double length,double radius)
{
super.radius = radius;
this.length = length;
}
 public double getSegmentArea() {
        double a = (radius-length)/radius;
        double b = (radius - length);
        double c = (2 * radius * length) - (length*length);
      return radius*radius*Math.sqrt(a - (b*c));
   }
}
public class TestCircle {
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      System.out.print("Enter the radius of circle : ");
      double radius = sc.nextInt();
      Circle c1 = new Circle(radius);
      System.out.print("Enter the degree for sector : ");
      Sector s1 = new Sector(Math.PI * sc.nextInt()/180,radius);
      System.out.print("Enter the length of segment : ");
      Segment s2 = new Segment(sc.nextInt() / 10,radius);
      System.out.println("The circle has radius of " 
         + c1.getRadius() + " and area of " + String.format("%.02f",c1.getArea()));
 System.out.println("The sector has angle of " 
         + String.format("%.02f",s1.radian) + "radians  and area of " + String.format("%.02f",s1.SectorArea()));
      System.out.println("The Segment has length of " 
         + s2.length + " and area of " + String.format("%.02f", s2.getSegmentArea()));
   }
}
