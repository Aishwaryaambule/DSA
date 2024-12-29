import java.util.*;

public class Input {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);

    // Arrays of primitives
    int[] arr = new int [5];
    arr[0] = 34;
    arr[1] = 49;
    arr[2] = 348;
    arr[3] = 324;
    arr[4] = 3;
    //[23,49,348,324,3]
    // System.out.println(arr[3]);

    // input using for loops
    // for(int i = 0; i < arr.length; i++){
    //   arr[i] = in.nextInt();
    // }
    // System.out.print(Arrays.toString(arr));

    // for(int i = 0; i < arr.length; i++){
    //   System.out.print(arr[i]);
    // }

    // for(int num : arr){ //For every element in array , print the element
    //  System.out.print(num + " "); //here num represents element of the array
    // }
      
    // System.out.println(arr[5]);  // index out of bound make error

    // Arrays of Objects
    String[] str = new String[4];
    for(int i = 0 ; i < str.length; i++){
      str[i] = in.next();
    }
    System.out.println(Arrays.toString(str));

      //Modify
      str[1] = "kunal";
      System.out.println(Arrays.toString(str));
  }
}
