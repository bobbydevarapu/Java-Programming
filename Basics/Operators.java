import java.util.Scanner;

public class Operators {
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    System.out.print("Enter first number: ");
    int a = sc.nextInt();

    System.out.print("Enter second number: ");
    int b = sc.nextInt();

    // Arithmetic Operators
    System.out.println("\nArithmetic Operators");
    System.out.println("a + b = " + (a + b));
    System.out.println("a - b = " + (a - b));
    System.out.println("a * b = " + (a * b));
    System.out.println("a / b = " + (a / b));
    System.out.println("a % b = " + (a % b));

    // Relational Operators
    System.out.println("\nRelational Operators");
    System.out.println("a == b : " + (a == b));
    System.out.println("a != b : " + (a != b));
    System.out.println("a > b  : " + (a > b));
    System.out.println("a < b  : " + (a < b));
    System.out.println("a >= b : " + (a >= b));
    System.out.println("a <= b : " + (a <= b));

    // Logical Operators
    System.out.println("\nLogical Operators");
    System.out.println("(a > 0 && b > 0) : " + (a > 0 && b > 0));
    System.out.println("(a > 0 || b > 0) : " + (a > 0 || b > 0));
    System.out.println("!(a > b) : " + !(a > b));

    // Assignment Operators
    int x = a;
    x += b;
    System.out.println("\nAssignment Operators");
    System.out.println("x += b : " + x);

    x = a;
    x -= b;
    System.out.println("x -= b : " + x);

    x = a;
    x *= b;
    System.out.println("x *= b : " + x);

    x = a;
    x /= b;
    System.out.println("x /= b : " + x);

    x = a;
    x %= b;
    System.out.println("x %= b : " + x);

    // Unary Operators
    int y = a;
    System.out.println("\nUnary Operators");
    System.out.println("++y = " + (++y));

    y = a;
    System.out.println("--y = " + (--y));

    sc.close();
  }
}