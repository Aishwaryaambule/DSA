
import java.util.*;

public class NaturalNo {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);

    System.out.println("Enter a n natural number");
    int n = in.nextInt();

    int ans = NatNumber(n);
    System.out.println(ans);
  }

  static int NatNumber(int n) {
    // sum of the first n natural number
    int sum = 0;
    for (int i = 1; i <= n; i++) {
      sum = sum +  i;
    }

    return sum;
  }
}
