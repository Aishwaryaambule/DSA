
import java.util.Scanner;

public class TypeCasting {
  public static void main(String[] args) {
     Scanner input = new Scanner(System.in);
    // float num = input.nextFloat(); 
    //1]conversion occur when destination type is greater than source type i.e float is greater than int.
    //2]type should be compatible.
    // System.out.println(num);

   //TYPE CASTING (Compressing bigger number in a smaller type explicitly )
    // int num = (int)(67.56f); //convert Float into int
    // System.out.println(num);

    //Automatic type promotion in expression
    // int a = 257;
    // byte b = (byte)(a); //257 % 256 = 1
    //  System.out.println(b);

    // byte a= 40;
    // byte b= 50;
    // byte c = 100;
    // int d = a*b / c;
    // System.out.println(d);

    // byte b = 50;
    // b = b * 2;
   // int not store in byte

    // int number ='a';
    // System.out.println(number);

    // System.out.println(3 * 34534242.54f);
    // System.out.println(4 * 3);

    byte b = 42;
    char c = 'a';
    short s = 1024;
    int i = 50000;
    float f = 5.67f;
    double d = 0.1234;
    double result = (f * b) + (f / c) - (d * s);
    //float + int - double = double
    System.out.println((f * b) + " " + (i / c) + " " + (d-s));
    System.out.println(result);
 }
}
