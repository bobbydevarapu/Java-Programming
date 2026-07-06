import java.util.Scanner;

public class Pattern18 {
  public static void PatternPrint18(int n) {
    char ele = (char) ('A' + n - 1);

    for (int i = 0; i < n; i++) {
      for (char ch = (char) (ele - i); ch <= ele; ch++) {
        System.out.print(ch + " ");
      }
      System.out.println();
    }
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter a number: ");
    int n = sc.nextInt();
    PatternPrint18(n);
    sc.close();
  }
}
