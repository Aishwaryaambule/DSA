
import java.util.Scanner;

public class PrimeNo {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);

    System.out.println("Enter a number");
    int n = in.nextInt();

    boolean ans = IsPrime(n);
    System.out.println(ans);
  }


  static boolean IsPrime(int n) {
    if ( n <= 1){
      return false;
    }
    int c = 2;
    while (c * c <= 0) {
      if (c % n == 0) {
        return false;
      }
      c++;
    }
     return  true;
  }
  
  
}
