// Name:Vedaant Ambolkar
// Roll no:5
// Exp no:10





public class Ex10 {
  public static void main(String[] args) {
      // Demonstrate ArithmeticException
      try {
          int numerator = 10;
          int denominator = 0;
          int result = numerator / denominator;
          System.out.println("Result: " + result);
      } catch (ArithmeticException e) {
          System.out.println("Error: Division by zero is not allowed.");
      } finally {
          System.out.println("This block executes regardless of an exception.");
      }

      // Demonstrate ArrayIndexOutOfBoundsException
      try {
          int[] numbers = {1, 2, 3};
          System.out.println("Accessing element at index 5: " + numbers[5]); 
      } catch (ArrayIndexOutOfBoundsException e) {
          System.out.println("Error: Array index is out of bounds.");
      } finally {
          System.out.println("This block executes regardless of an exception.");
      }
  }
}
