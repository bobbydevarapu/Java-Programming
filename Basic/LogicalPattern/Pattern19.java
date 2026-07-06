import java.util.Scanner;

public class Pattern19 {

  public static void PrintPattern19(int n) {

    // Upper Half
    for (int i = 0; i < n; i++) {

      for (int j = 0; j < n - i; j++)
        System.out.print("*");

      for (int j = 0; j < 2 * i; j++)
        System.out.print(" ");

      for (int j = 0; j < n - i; j++)
        System.out.print("*");

      System.out.println();
    }

    // Lower Half
    for (int i = 0; i < n; i++) {

      for (int j = 0; j <= i; j++)
        System.out.print("*");

      for (int j = 0; j < 2 * (n - i - 1); j++)
        System.out.print(" ");

      for (int j = 0; j <= i; j++)
        System.out.print("*");

      System.out.println();
    }
  }

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    System.out.print("Enter a number: ");
    int n = sc.nextInt();

    PrintPattern19(n);

    sc.close();
  }
}