package Basic.LanguageBasics;

public class ExceptionHandling {
  public static void main(String[] args) {

    try {
      int[] arr = { 10, 20, 30 };
      System.out.println(arr[5]);
    } catch (Exception e) {
      System.out.println("Exception Caught");
    } finally {
      System.out.println("Program Finished");
    }
  }
}