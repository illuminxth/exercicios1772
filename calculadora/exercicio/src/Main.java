
/**
 * main
 */
import java.util.Scanner;

public class Main {

  public static void main(String[] args) {

    Scanner input = new Scanner(System.in);
    System.out.println("Type the number 1: ");
    double number1 = input.nextDouble();

    System.out.println("Type the number 2: ");
    double number2 = input.nextDouble();

    double result;

    while (true) {
      System.out.println("< Calculator >\n1 - Sum\n2 - Subtraction\n3 - Multiplication\n4 - Division\n5 - Sair");
      int option = input.nextInt();

      switch (option) {
        case 1:
          result = Calculations.sum(number1, number2);
          System.out.println("The result is: " + result);
          break;

        case 2:
          result = Calculations.subtraction(number1, number2);
          System.out.println("The result is: " + result);
          break;

        case 3:
          result = Calculations.multiplication(number1, number2);
          System.out.println("The result is: " + result);
          break;

        case 4:
          result = Calculations.division(number1, number2);
          System.out.println("The result is: " + result);
          break;

        case 5:
          System.exit(0);
          break;
      }
    }
  }
}