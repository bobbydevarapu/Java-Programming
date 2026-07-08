import java.util.Scanner;

public class Pattern12 {
  public void PatternPrint12(int n) {
    for (int i = 1; i <= n; i++) {

      // Left numbers
      for (int j = 1; j <= i; j++) {
        System.out.print(j);
      }

      // Spaces
      for (int j = 1; j <= 2 * (n - i); j++) {
        System.out.print(" ");
      }
      // Right numbers
      for (int j = i; j >= 1; j--) {
        System.out.print(j);
      }

      System.out.println();
    }
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter number: ");
    int n = sc.nextInt();
    Pattern12 pattern = new Pattern12();
    pattern.PatternPrint12(n);
    sc.close();
  }
}