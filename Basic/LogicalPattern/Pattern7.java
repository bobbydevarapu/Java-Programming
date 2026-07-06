import java.util.Scanner;

public class Pattern7 {
  public static void PattrenPrint7(int n) {
    for (int i = 0; i < n; i++) {
      for (int j = 0; j < n - i; j++) {
        System.out.print(" ");
      }
      for (int j = 0; j < 2 * i + 1; j++) {
        System.out.print("*");
      }
      System.out.println();
    }
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter a number: ");
    int n = sc.nextInt();
    PattrenPrint7(n);
    sc.close();
  }
}