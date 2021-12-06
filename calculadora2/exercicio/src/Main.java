import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);

        System.out.println("Type the number 1: ");
        double number1 = input.nextDouble();

        System.out.println("Type the number 2: ");
        double number2 = input.nextDouble();

        Calculator calc = new Calculator(number1, number2);

        while (true) {
            System.out.println(
                    "< Calculator >\n1 - Show numbers\n2 - Change numbers\n3 - Sum\n4 - Subtraction\n5 - Multiplication\n6 - Division\n7 - Exit");
            int option = input.nextInt();

            double result;

            switch (option) {

                case 1:
                    System.out.println("Your number 1 is " + calc.getNumber1());
                    System.out.println("Your number 2 is " + calc.getNumber2());
                    break;

                case 2:
                    System.out.println("Type the number 1: ");
                    double newNumber1 = input.nextDouble();
                    calc.setNumber1(newNumber1);

                    System.out.println("Type the number 2: ");
                    double newNumber2 = input.nextDouble();
                    calc.setNumber2(newNumber2);
                    break;

                case 3:
                    result = calc.sum();
                    System.out.println("The result is: " + result);
                    break;

                case 4:
                    result = calc.subtraction();
                    System.out.println("The result is: " + result);
                    break;

                case 5:
                    result = calc.multiplication();
                    System.out.println("The result is: " + result);
                    break;

                case 6:
                    result = calc.division();
                    System.out.println("The result is: " + result);
                    break;

                case 7:
                    System.exit(0);
                    break;
            }
        }
    }
}