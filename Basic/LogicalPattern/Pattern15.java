import java.util.Scanner;

public class Pattern15 {
  public static void PatternPrint15(int n) {
    for (int i = 0; i < n; i++) {
      for (char ch = 'A'; ch <= 'A' + (n - i - 1); ch++) {
        System.out.print(ch + " ");
      }
      System.out.println();
    }
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter a number:");
    int n = sc.nextInt();
    PatternPrint15(n);
    sc.close();
  }
}
