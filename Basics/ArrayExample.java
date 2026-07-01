import java.util.*;

public class ArrayExample {
  public static void main(String[] args) {

    int[] arr = { 10, 20, 30, 40, 50 };
    System.out.println(Arrays.toString(arr));
    for (int num : arr) {
      System.out.print(num + " ");
    }
  }
}