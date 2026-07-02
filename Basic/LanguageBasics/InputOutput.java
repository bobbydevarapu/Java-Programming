package Basic.LanguageBasics;

import java.util.Scanner;

public class InputOutput {

  public static void printNumbers(int n) {
    System.out.println(n);
  }

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    System.out.print("Entered:");
    int n = sc.nextInt();
    printNumbers(n);

    sc.close();
  }
}