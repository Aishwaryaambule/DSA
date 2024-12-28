
import java.util.Scanner;

public class simpleInterest {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    System.out.println("Enter a principal value :");
    int p = in.nextInt();
    System.out.println("Enter a time(in a year) value");
    int t = in.nextInt();
    System.out.println("Enter a rate value");
    int r = in.nextInt();
    double simpleInterest = p*r*t/100;
    System.out.println(simpleInterest);
  }
}
