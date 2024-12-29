import java.util.*;

public class Questions {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    // int n = in.nextInt();
    // System.out.println(isPrime(n));
    // System.out.println(ArmStrong(n));

    for(int i = 100; i< 1000; i++){
      if(ArmStrong(i)){
        System.out.println(i + " ");
      }
    }
  }

  // Print all the 3 digits armstrong numbers
  static boolean ArmStrong(int n){
    int original = n;
    int sum = 0;

    while(n > 0){
      int rem = n % 10;
      int cube = rem*rem*rem;
      // sum += cube;
      sum = sum + cube;
      n = n/10;
    }
    if( sum == original){
      return  true;
    }
    return false;
  }


  static boolean isPrime(int n) {
    if (n <= 1) {
      return false;
    }

    // for(int i = 2; i < n; i++) {
    // if(n % i == 0) {
    // return false;
    // }
    // }

    // return true;

    int i = 2;
    while (i * i <= n) {
      if (n % i == 0) {
        return false;
      }
      i++;
    }
    return true;
  }
}
