import java.util.Scanner;

public class Pattern14 {

  public static void PattrenPrint14(int n) {
    for (int i = 0; i < n; i++) {
      for (char ch = 'A'; ch <= 'A' + i; ch++) {
        System.out.print(ch + " ");
      }
      System.out.println();
    }
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter a number:");
    int n = sc.nextInt();
    PattrenPrint14(n);
    sc.close();
  }
}
