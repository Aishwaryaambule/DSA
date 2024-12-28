import  java.util.*;

public class CountsNum {
  public static void main(String[] args) {
    Scanner in= new Scanner(System.in);
    int n = 4555364;
    
    int count = 0;
    while(n > 0){ // when number is dead(45536 becomes 0)
      int rem = n%10; // extract the unit digit  (n % 10 mean n / 10 (rem left))
      if(rem==5){ // check
        count++;
      }
       n=n/10; // remove the left digit  45536  becomes 4553
    }
      System.out.println(count);

  }
}
