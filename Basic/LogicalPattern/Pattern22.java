import java.util.Scanner;

public class Pattern22 {
  public static void PatternPrint17(int n) {
    for (int i = 0; i < n; i++) {
      for (int j = 0; j < n - i - 1; j++) {
        System.out.print(" ");
      }
      char ch = 'A';
      for (int j = 0; j < 2 * i + 1; j++) {
        System.out.print(ch);
        if (j < i)
          ch++;
        else
          ch--;
      }
      System.out.println();
    }
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter a number: ");
    int n = sc.nextInt();
    PatternPrint17(n);
    sc.close();
  }
}
