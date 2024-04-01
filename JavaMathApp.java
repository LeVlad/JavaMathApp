// imported scanner to get user input
import java.util.Scanner;


// declared main class

class JavaMathApp {


//declared  main method to get user input and print to console
  public static void main(String[] args) {

  


    Scanner scn = new Scanner(System.in);
    System.out.println("Please enter the first number:");
    int first = scn.nextInt();
    System.out.println("Please enter the second number");
    int second = scn.nextInt();
    System.out.println("Please enter the type of operation (Addition (+), Multiplication (*), Division(/), Subtraction(-)):");
    String third = scn.next();

    // conditional to check value of input, execute mathematical operations and print to console

    if (third.equals("+")){
        // add the two inputs
    int sum = first + second;
    System.out.println(first + " + " + second + " = "  + sum);
    
    } else if (third.equals("-")){
        //subtract the two inputs
        int subtraction = first - second;
        System.out.println(first + " - " + second + " = "  + subtraction);
        } else if (third.equals("/")) {
            // divide the two inputs
    int division = first / second;
    System.out.println(first + " / " + second + " = "  + division);
        } else if (third.equals("*")){
            // multiply the two inputs
    int multiplication = first * second;
    System.out.println(first + " * " + second + " = "  + multiplication);
        }
    
        try {
            if ( != int) {
                throw new IllegalArgumentException("Please enter appropriate type");
                }
          } catch (Exception e) {
            System.out.println("Only numbers please!");
          }
        }
      }
    
  }
}