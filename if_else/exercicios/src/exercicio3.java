import java.util.Scanner;

public class exercicio3 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    int numero1 = input.nextInt();
    int numero2 = input.nextInt();
    int soma = numero1 + numero2;
    int subtração = numero1 - numero2;
    int multiplicação = numero1 * numero2;
    double divisão = (double) numero1 / (double) numero2;
    double resto = divisão % 2.0;

    System.out.println("A soma é " + soma);
    System.out.println("A subtração é " + subtração);
    System.out.println("A multiplicação é " + multiplicação);
    System.out.println("A divisão é " + divisão);
    System.out.println("O resto da divisão é " + resto);

  }
}