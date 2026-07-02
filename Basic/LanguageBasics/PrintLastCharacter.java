package Basic.LanguageBasics;

import java.util.Scanner;

public class PrintLastCharacter {
  public static void printingMethod(String str) {
    if (str.length() == 0) {
      return;
    }
    System.out.println(str.charAt(str.length() - 1));
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter a string: ");
    String str = new String();
    str = sc.nextLine();
    printingMethod(str);
    sc.close();
  }
}
