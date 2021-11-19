import java.util.Scanner;

public class exercicio1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int numero1 = input.nextInt();
        int numero2 = input.nextInt();

        if (numero1 > numero2) {
            System.out.println("O maior numero é: " + numero1);
        } else {
            System.out.println("O maior numero é: " + numero2);
        }
    }
}