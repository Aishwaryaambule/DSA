public class arr {
  public static void main(String[] args) {
    // Q: store a roll number
    // int a = 51;

    // Syntax = datatype [] variable_name = new datatype [size];

    // Store 5 roll number
    // int [] rollno = new int[5];

    // or directly write
    // int [] rollno2 = {23,12,45,15};

    int[] rollno; // Declaration of array : rollno is getting defined in the stack
    // rollno => 1] ref variable 2] compile time

    rollno = new int[5]; // Initialization : actualy here object is being created in the memory(heap)
    // new int [5]; => 1] Creating a object in a heap memory
    // 2] occurs at run time
    // 3] Dynamic memory allocation

    // System.out.println(rollno[1]);

    String[] arr = new String [4];
    System.out.println(arr[0]);

  }
}
