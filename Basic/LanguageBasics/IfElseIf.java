package Basic.LanguageBasics;

import java.util.Scanner;

class GradeCalculator {

  public static void ifElseMethod(int marks) {

    if (marks >= 90) {
      System.out.println("Grade A");
    } else if (marks >= 70) {
      System.out.println("Grade B");
    } else if (marks >= 50) {
      System.out.println("Grade C");
    } else if (marks >= 35) {
      System.out.println("Grade D");
    } else {
      System.out.println("Failed");
    }
  }
}

public class IfElseIf {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    System.out.print("Enter your marks: ");
    int marks = sc.nextInt();

    GradeCalculator.ifElseMethod(marks);

    sc.close();
  }
}