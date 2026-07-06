
import java.util.Scanner;

public class Pattern3 {
  public static void PatternPrint3(int n) {
    if (n <= 0 || n < 1) {
      System.out.println("Please enter a positive integer.");
      return;
    }

    for (int i = 1; i < n; i++) {
      for (int j = 1; j <= i; j++) {
        System.out.print(j);
      }
      System.out.println();
    }
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter a number: ");
    int n = sc.nextInt();
    PatternPrint3(n);
    sc.close();
  }

}
