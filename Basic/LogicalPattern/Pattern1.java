package Basic.LogicalPattern;

import java.util.Scanner;

public class Pattern1 {

  public static void PatternPrint1(int n) {
    for (int i = 0; i < n; i++) {
      for (int j = 0; j < n; j++) {
        System.out.print("*");
      }
      System.out.println();
    }
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("Enter a number: ");
    int n = sc.nextInt();

    PatternPrint1(n);

    sc.close();
  }
}