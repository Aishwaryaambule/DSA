import java.util.*;


public class ReverseValue {
  public static void main(String[] args) {
    Scanner in= new Scanner(System.in);
    
    int num = 345672;

    int ans = 0;

    while (num > 0) {
      int rem = num % 10;
      num /= 10;

      ans = ans * 10 + rem;
      
    }
      System.out.println(ans);
  }

  
}
