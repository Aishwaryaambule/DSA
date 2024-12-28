import  java.util.*;

public class SwapNumber {
  public static void main(String[] args) {
   Scanner in = new Scanner(System.in); 

/*
 * primitives are passed by value or just passing value
 * Objects : passing value of a ref variable
 */

   int a = 10;
   int b = 11;

  //  Swap numbers code
  // int temp =a;
  // a = b;
  // b = temp;

  swap(a,b);

  System.out.println(a + " " + " " + b);

  String name = "Kunal Kushwaha";
  changeName(name);
  System.out.println(name);
}

  static  void changeName(String naam)
  {
    naam = "Rahul Rana"; //not changing obj , creating a new obj
  }

  static void  swap(int num1, int num2){
    int temp = num1;
    num1 = num2;
    num2 = temp;

    // this change will only be valid in this function scope only.
  }
}
