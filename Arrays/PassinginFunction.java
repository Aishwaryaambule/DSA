
import java.util.Arrays;


public class PassinginFunction {
  public static void main(String[] args) {
    int [] nums = {3, 4, 5, 6};
    System.out.println(Arrays.toString(nums));
    change(nums);
    System.out.println(Arrays.toString(nums));

    // Arrays are mutable in java i.e you can change  the object
    
  }

  static void change(int[] arr){
    arr[0] = 99;
  }
}
