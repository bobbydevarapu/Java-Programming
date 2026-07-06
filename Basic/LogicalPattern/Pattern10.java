import java.util.Scanner;

public class Pattern10 {
  public static void PatternPrint10(int n) {
    for (int i = 0; i < n; i++) {
      for (int j = 0; j < i; j++) {
        System.out.print("*");
      }
      System.out.println();
    }
  }

  public static void PatternPrint11(int n) {
    for (int i = 0; i < n; i++) {
      for (int j = 0; j < n - i; j++) {
        System.out.print("*");
      }
      System.out.println();
    }
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter a number:");
    int n = sc.nextInt();
    PatternPrint10(n);
    PatternPrint11(n);
    sc.close();
  }
}
