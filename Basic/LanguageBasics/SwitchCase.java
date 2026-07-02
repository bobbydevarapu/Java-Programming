package Basic.LanguageBasics;

import java.util.Scanner;

class SwitchUtility {
  public static void printDay(int day) {
    switch (day) {
      case 1:
        System.out.println("Monday");
        break;
      case 2:
        System.out.println("Tuesday");
        break;
      case 3:
        System.out.println("Wednesday");
        break;
      case 4:
        System.out.println("Thursday");
        break;
      case 5:
        System.out.println("Friday");
        break;
      case 6:
        System.out.println("Saturday");
        break;
      case 7:
        System.out.println("Sunday");
        break;
      default:
        System.out.println("Invalid Day");
    }
  }
}

public class SwitchCase {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter a Day: ");
    int day = sc.nextInt();
    SwitchUtility.printDay(day);
    sc.close();
  }
}
