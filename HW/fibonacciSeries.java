 import java.util.*;

 
public class fibonacciSeries {
    public static void main(String[] args) {
      Scanner in = new Scanner(System.in);
      System.out.println("Enter a value n:");
      int n = in.nextInt();
      int a= 0 ;
      int b= 1;
      System.out.print(a + " " + b + " ");
      int count = 2;

      for (int i = 2; i <= n; i++){
          
          int next = a + b;
          a = b;
          b = next;
           System.out.print(b + " ");
        
      }

    }
  }