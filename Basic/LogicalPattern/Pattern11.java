public class Pattern11 {
  public static void PatternPrint11(int n) {
    for (int i = 0; i < n; i++) {
      int start = (i % 2 == 0) ? 1 : 0;
      for (int j = 0; j <= i; j++) {
        System.out.print(start + " ");
        start = 1 - start; // Toggle between 0 and 1
      }
      System.out.println();
    }
  }

  public static void main(String[] args) {
    java.util.Scanner sc = new java.util.Scanner(System.in);
    System.out.print("Enter a number:");
    int n = sc.nextInt();
    PatternPrint11(n);
    sc.close();
  }
}
