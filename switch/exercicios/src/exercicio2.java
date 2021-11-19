import java.util.Scanner;

public class exercicio2 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    System.out.println("Insira o valor: ");
    double valor = input.nextInt();

    System.out.println("Cargos disponíveis:\n1 - Cliente comum\n2 - Funcionário\n3 - VIP");

    System.out.println("Qual o seu cargo?");

    double porcentagem1;
    porcentagem1 = (valor * 0.9);

    double porcentagem2;
    porcentagem2 = (valor * 0.95);

    Scanner cargo = new Scanner(System.in);
    String número = cargo.nextLine();

    switch (número) {
    case "1":
      System.out.println("Você irá pagar " + valor + " reais");
      break;

    case "2":
      System.out.println("Você irá pagar " + porcentagem1 + " reais");
      break;

    case "3":
      System.out.println("Você irá pagar " + porcentagem2 + " reais");
      break;

    default:
      System.out.println("Opção inválida");

    }
  }
}