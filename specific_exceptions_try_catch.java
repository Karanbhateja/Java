// Import the Scanner class from the java.util package
import java.util.Scanner;

public class try_catch {
  public static void main(String[] args) {
    // Create an array of integers with 3 elements
    int marks[]= new int[3];
    marks[0] = 15;
    marks[1] = 18;
    marks[2] = 19;
    
    // Create a Scanner object to read input from the console
    Scanner obj = new Scanner(System.in);
    
    // Prompt the user to enter the denominator
    System.out.println("Enter the denominator : ");
    int inp = obj.nextInt();
    
    // Prompt the user to enter the position of the element in the array
    System.out.println("Enter the position of the element in the array: ");
    int i = obj.nextInt();
    
    // Try block to execute the code that may throw an exception
    try {
      // Print the selected element from the array
      System.out.println("Number that isselected to be divided is : "+ marks[i]);
      
      // Print the denominator entered by the user
      System.out.println("Number entered for division is : "+ inp);
      
      // Divide the selected element by the denominator and print the result
      System.out.println("Result is " + marks[i]/inp);
    }
    
    // Catch block to handle an ArithmeticException ( If value of denominator is entered 0 by the user )
    catch (ArithmeticException e) {
      System.out.println("Division by zero is not allowed.");
    }
    
    // Catch block to handle an ArrayIndexOutOfBoundsException ( If the position of the element entered by the user does not exist or is out of bound )
    catch(ArrayIndexOutOfBoundsException e) {
        System.out.println("You have entered out of range element");
    }
    
    // Catch block to handle any other exception
    catch(Exception e){
        System.out.println("Exception occured");
    }
  }
}
