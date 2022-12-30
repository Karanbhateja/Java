// Define a custom exception class for negative radius
class NegativeRadiusException extends Exception {
  // Override the toString method to return a custom message
  @Override
  public String toString() {
    return "Radius is negative";  // This tells what is the exception
  }

  // Override the getMessage method to return a custom message
  @Override
  public String getMessage() {
    return "Radius cannot be negative"; // This is the message for the exception 
  } 
}

public class Throw_keyword {
  // Calculate the area of a circle with given radius
  public static double area(int r) throws NegativeRadiusException { // throws keyword is used here
    // If the radius is negative, throw a NegativeRadiusException
    if (r < 0) {
      throw new NegativeRadiusException();
    }
    // Calculate the area
    double ar = Math.PI * r * r;
    return ar;
  }

  public static void main(String[] args) {
    // Declare a variable to store the result
    double circlear;
    try {
      // Calculate the area with a negative radius
      circlear = area(-5);
      // This line will not be executed because of the exception
      System.out.println("Area is " + circlear);
    } catch (Exception e) {
      // Catch the exception and print the exception message
      System.out.println(e);
      System.out.println(e.getMessage());
    }
  }
}
