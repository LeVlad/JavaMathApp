import java.util.Scanner;

class JavaMathApp {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        while (true) {
            System.out.println("Please enter the first number:");
            int first = 0;
            int second = 0;
            String third = "";
            try {
                first = scn.nextInt();
                System.out.println("Please enter the second number:");
                second = scn.nextInt();
                System.out.println("Please enter the type of operation (Addition (+), Multiplication (*), Division(/), Subtraction(-)):");
                third = scn.next();

                if (third.equals("+")) {
                    int sum = first + second;
                    System.out.println("The result is " + first + " + " + second + " = " + sum);
                } else if (third.equals("-")) {
                    int subtraction = first - second;
                    System.out.println("The result is " + first + " - " + second + " = " + subtraction);
                } else if (third.equals("/")) {
                    int division = first / second;
                    System.out.println("The result is " + first + " / " + second + " = " + division);
                } else if (third.equals("*")) {
                    int multiplication = first * second;
                    System.out.println("The result is " + first + " * " + second + " = " + multiplication);
                } else {
                    System.out.println("Invalid operation.");
                }
            } catch (Exception e) {
                System.out.println("Invalid input. Please enter only numbers.");
                scn.next(); // Clears the invalid input
            }

            System.out.println("Do you want to perform another operation? (yes/no)");
            String choice = scn.next();
            if (!choice.equalsIgnoreCase("yes")) {
                break;
            }
        }
        scn.close();
    }
}
