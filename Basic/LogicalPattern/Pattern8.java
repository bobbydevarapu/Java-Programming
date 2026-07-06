import java.util.Scanner;

public class Pattern8 {
  public static void PatternPrint8(int n) {
    for (int i = 0; i < n; i++) {
      for (int j = 0; j < i; j++) {
        System.out.print(" ");
      }
      for (int j = 0; j < 2 * n - 1 - (2 * i); j++) {
        System.out.print("*");
      }
      System.out.println();
    }
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter a number: ");
    System.out.println();
    int n = sc.nextInt();
    PatternPrint8(n);
    sc.close();
  }
}