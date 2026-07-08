import java.util.Scanner;

public class Pattern20 {
  public static void PatternPrint20(int n) {

    // Upper Half
    for (int i = 1; i <= n; i++) {

      for (int j = 0; j < i; j++)
        System.out.print("*");

      for (int j = 0; j < 2 * (n - i); j++)
        System.out.print(" ");

      for (int j = 0; j < i; j++)
        System.out.print("*");

      System.out.println();
    }

    // Lower Half
    for (int i = n - 1; i >= 1; i--) {

      for (int j = 0; j < i; j++)
        System.out.print("*");

      for (int j = 0; j < 2 * (n - i); j++)
        System.out.print(" ");

      for (int j = 0; j < i; j++)
        System.out.print("*");

      System.out.println();
    }
  }

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    System.out.print("Enter a number: ");
    int n = sc.nextInt();
    PatternPrint20(n);
    sc.close();
  }
}
