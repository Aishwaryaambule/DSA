import java.util.*;

public class usd {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    System.out.println("Enter amount in INR :");
    double amountInINR  = in.nextDouble();

    //Convert to USD
      double amountInUSD = amountInINR * 0.012;
      System.out.println("Equilavent amount in USD :" + amountInUSD);
 }
  
}
