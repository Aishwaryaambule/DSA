public class FunctionOverloading {
  public static void main(String[] args) {
    //  fun(67); //Pass integer directly
    // fun("Kunal Kushwaha");//Pass string directly
    int ans = sum(3,4,45);
    System.out.println(ans);

  }
//In FunctionOverloading compile time decide which function to run

  static int sum(int a , int b){
    System.out.println("Sum of two number");
    return  a + b;  
  }

  static int sum(int a, int b, int c){
    System.out.println("Sum of three number");
    return a + b + c;
  }
  
  static void fun(int a){
    System.out.println("First one");
    System.out.println(a);
  }

  static  void fun(String name){
    System.out.println("second one");
    System.out.println(name);
  }
}


//when two or more function have same name,same return type and stuff but different argument  is called functionOverloading

//either the number of argument should different or type of argument should different.