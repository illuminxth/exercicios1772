import java.util.Scanner;

public class exercicio3 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    while (true) {
      System.out
          .println("< Conversão de moedas >\n1 - Real para Dólar\n2 - Dólar para Real\n3 - Real para Euro\n4 - Sair");
      int opção = input.nextInt();

      switch (opção) {
      case 1:
        System.out.println("Digite o valor em reais: ");
        double valor = input.nextInt();
        double realdolar;
        realdolar = (valor / 5.56);
        System.out.println("O valor de " + valor + " reais em dólares vale " + realdolar + "U$");
        break;

      case 2:
        System.out.println("Digite o valor em dólares: ");
        double valor2 = input.nextInt();
        double dolarreal;
        dolarreal = (valor2 * 5.56);
        System.out.println("O valor de " + valor2 + " doláres em reais vale " + dolarreal + "R$");
        break;

      case 3:
        System.out.println("Digite o valor em reais: ");
        double valor3 = input.nextInt();
        double realeuro;
        realeuro = (valor3 * 6.47);
        System.out.println("O valor de " + valor3 + " reais em euros vale " + realeuro + "€");
        break;

      case 4:
        System.out.println("Obrigado por utilizar nosso conversor de moedas em JAVA :D");
        System.exit(0);
      }

    }
  }
}
