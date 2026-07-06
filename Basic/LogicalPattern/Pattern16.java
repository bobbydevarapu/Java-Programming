import java.util.Scanner;

public class Pattern16 {
  public static void PatternPrint16(int n) {
    for (int i = 0; i < n; i++) {
      for (int j = 0; j <= i; j++) {
        System.out.print((char) ('A' + i) + " ");
      }
      System.out.println();
    }
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter a number: ");
    int n = sc.nextInt();
    PatternPrint16(n);
    sc.close();
  }
}
