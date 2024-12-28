import java.util.Arrays;

public class ChangeValue {
  public static void main(String[] args) {
    //create a array
     int[] arr = {1,2,3,43,3};
     change(arr);
     System.out.println(Arrays.toString(arr));
  }

  static  void change(int[] nums){
    nums[0] = 99;  //if you make a change to the object via this ref variable, same object will be change
  }
}
