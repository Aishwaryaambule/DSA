
import java.util.Scanner;

public class ACircle {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);

    System.out.println("Enter a value of radius");
    double r = in.nextDouble();
      
     double ans = AreaCircle(r);
     System.out.println("Area of Circle");
     System.out.println(ans);
     

     System.out.println("Circumference of circle : ");
     Circumference(r);
  }

  static  Double AreaCircle(double r){
     return ( 22/7 * r * r);
  }

  static void Circumference(double r){
     double ans = 2 * 22/7 * r;
     System.out.println(ans);
  }
}
