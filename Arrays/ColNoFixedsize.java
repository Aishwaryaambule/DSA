import java.util.*;

public class ColNoFixedsize {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    // int[][] arr = {
    //     { 1, 2, 3, 4 },
    //     { 5, 6 },
    //     { 7, 8, 9 }
    // };

    // for (int row = 0; row < arr.length; row++) {
    //   for (int col = 0; col < arr[row].length; col++) {
    //     System.out.print(arr[row][col] + " ");
    //   }
    //   System.out.println();
    // }

    // int n =  in.nextInt();
    // int m = in.nextInt();
    // int[][] arr = new int[n][m];
    // for(int i = 0; i < n; i++) {
    //   for(int j = 0; j < m; j++) {
    //     arr[i][j] = in.nextInt(); 
    //   }
    // }

    int[][] arr = new int[4][5];

    // arr.length = 4;
    // arr[0].length = 5;
    

    for(int row = 0 ; row < arr.length; row++){
      for(int col=0; col <arr[row].length; col++){
        arr[row] [col] = in.nextInt();
      }
    }

    for(int row= 0; row < arr.length; row++){
      for(int col = 0; col< arr[row].length; col++){
        System.out.print(arr[row][col]+ " ");
      }
      System.out.println();
    }
  }
}
