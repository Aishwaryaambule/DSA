public class Shadowing {
  static int x = 90; // Class-level (static) variable

  public static void main(String[] args) {
      System.out.println(x); // 90
     
      // int x = 40;  // Shadowing the class-level variable 'x' within the main metho
       int x;
      // System.out.println(x); // scope will begin when value is initialized
      x = 40;
      System.out.println(x); // 40
      fun(); // Call the static method 'fun'
  }

  static void fun() {
      System.out.println(x); // Accesses the class-level variable 'x'
  }
}
