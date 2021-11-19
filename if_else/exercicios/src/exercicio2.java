import java.util.Scanner;

public class exercicio2 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    int numero1 = input.nextInt();
    int numero2 = input.nextInt();
    int numero3 = input.nextInt();
    // printar quando: 1 - 2 - 3
    if (numero1 > numero2 && numero1 > numero3) {
      System.out.println("O numero 1 é o maior");
      if (numero2 > numero3) {
        System.out.println("A sequencia é 1-2-3");
      } else {
        System.out.println("A sequencia é 1-3-2");
      }
    } else if (numero2 > numero1 && numero2 > numero3) {
      System.out.println("O numero 1 é o maior");
      if (numero1 > numero3) {
        System.out.println("A sequencia é 2-1-3");
      } else {
        System.out.println("A sequencia é 2-3-1");
      }
    } else if (numero3 > numero1 && numero3 > numero2) {
      System.out.println("O numero 1 é o maior");
      if (numero1 > numero2) {
        System.out.println("A sequencia é 3-1-2");
      } else {
        System.out.println("A sequencia é 3-2-1");
      }
    }
  }
}