public class try_catch {
  public static void main(String[] args) {
    try {
      // Code that may throw an exception
      int a = 5;
      int b = 0;
      int c = a / b; // This line may throw an ArithmeticException
      System.out.println(c);
    } catch (ArithmeticException e) {
      // Exception handling code
      System.out.println("Division by zero is not allowed.");
    }
  }
}
