import java.util.Scanner;

public class PrintingNtimes {

  public static void printMethod(int X, int N) {

    for (int i = 0; i < N; i++) {
      System.out.print(X);

      if (i < N - 1) {
        System.out.print(" ");
      }
    }

    System.out.println();
  }

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    System.out.print("Enter the number to print: ");
    int X = sc.nextInt();

    System.out.print("Enter the number of times to print: ");
    int N = sc.nextInt();

    printMethod(X, N);

    sc.close();
  }
}