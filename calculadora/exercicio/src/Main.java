
/**
 * main
 */
import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    while (true) {
      System.out.println("< Calculator >\n1 - Sum\n2 - Subtraction\n3 - Multiplication\n4 - Division\n5 - Sair");
      int option = input.nextInt();

      switch (option) {
        case 1:
          System.out.println("Type the number 1: ");
          double number1 = input.nextDouble();

          System.out.println("Type the number 2: ");
          double number2 = input.nextDouble();

          double sum = Calculations.sum(number1, number2);
          System.out.println("The result is: " + sum);
          break;

        case 2:
          System.out.println("Type the number 1: ");
          double number3 = input.nextDouble();

          System.out.println("Type the number 2: ");
          double number4 = input.nextDouble();

          double subtraction = Calculations.subtraction(number3, number4);
          System.out.println("The result is: " + subtraction);
          break;

        case 3:
          System.out.println("Type the number 1: ");
          double number5 = input.nextDouble();

          System.out.println("Type the number 2: ");
          double number6 = input.nextDouble();

          double multiplication = Calculations.multiplication(number5, number6);
          System.out.println("The result is: " + multiplication);
          break;

        case 4:
          System.out.println("Type the number 1: ");
          double number7 = input.nextDouble();

          System.out.println("Type the number 2: ");
          double number8 = input.nextDouble();

          double division = Calculations.division(number7, number8);
          System.out.println("The result is: " + division);
          break;

        case 5:
          System.exit(0);
          break;
      }
    }
  }
}