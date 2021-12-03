import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);

        while (true) {

            System.out.println("Type the number 1: ");
            double number1 = input.nextDouble();

            System.out.println("Type the number 2: ");
            double number2 = input.nextDouble();

            Calculator calc = new Calculator(number1, number2);

            System.out.println("< Calculator >\n1 - Sum\n2 - Subtraction\n3 - Multiplication\n4 - Division\n5 - Exit");
            int option = input.nextInt();

            double result;

            switch (option) {
                case 1:
                    result = calc.sum();
                    System.out.println("The result is: " + result);
                    break;

                case 2:
                    result = calc.subtraction();
                    System.out.println("The result is: " + result);
                    break;

                case 3:
                    result = calc.multiplication();
                    System.out.println("The result is: " + result);
                    break;

                case 4:
                    result = calc.division();
                    System.out.println("The result is: " + result);
                    break;

                case 5:
                    System.exit(0);
                    break;
            }
        }
    }
}