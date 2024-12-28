import java.util.Scanner;

public class AreaofCircle {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);

    System.out.println("Enter a value of base");
    double base = in.nextDouble();
    System.out.println("Enter a value of height");
    double height = in.nextDouble();
    //  double radius = in.nextDouble();
       
    //  double area = circle(radius);
     double tArea = triangle(base, height);

     System.out.println("Area of triangle is : " + tArea);
  }


  public static double circle(double r) {
    double area = 22/7 * r * r;
    return area;
  }


  public static double triangle(double b,double h){
    double area = (0.5 * b * h);
    return area;
  }
}
