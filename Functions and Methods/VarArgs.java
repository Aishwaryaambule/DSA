
import java.util.Arrays;

public class VarArgs {
  public static void main(String[] args) {
    //  fun(2, 3, 44, 56, 23, 45, 1);//variable length argument
    //fun()
    // MultipleArgs(2, 4, "Rahul" , "Kunal", "Aish");
    // demo(2,3,4);
    demo("Kunal", "Rohan", "Aish");
    // demo(); //Ambiguity
  }

static void demo(int...v){
  System.out.println(Arrays.toString(v));
}

static void demo(String...v){
  System.out.println(Arrays.toString(v));
}

static void MultipleArgs(int a, int b, String...v){ //variable length argument always at the end

}

static void fun(int ...v){ //array of type int
  System.out.println(Arrays.toString(v));
}
}
