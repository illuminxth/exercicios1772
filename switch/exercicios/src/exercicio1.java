import java.util.Scanner;

public class exercicio1 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("Digite o número do mês:");

		String mês = input.nextLine();

		switch (mês) {
		case "1":
			System.out.println("O mês 1 equivale a Janeiro");
			break;

		case "2":
			System.out.println("O mês 2 equivale a Fevereiro");
			break;

		case "3":
			System.out.println("O mês 3 equivale a Março");
			break;

		case "4":
			System.out.println("O mês 4 equivale a Abril");
			break;

		case "5":
			System.out.println("O mês 5 equivale a Maio");
			break;

		case "6":
			System.out.println("O mês 6 equivale a Junho");
			break;

		case "7":
			System.out.println("O mês 7 equivale a Julho");
			break;

		case "8":
			System.out.println("O mês 8 equivale a Agosto");
			break;

		case "9":
			System.out.println("O mês 9 equivale a Setembro");
			break;

		case "10":
			System.out.println("O mês 10 equivale a Outubro");
			break;

		case "11":
			System.out.println("O mês 11 equivale a Novembro");
			break;

		case "12":
			System.out.println("O mês 12 equivale a Dezembro");
			break;

		default:
			System.out.println("Mês inválido");
		}
	}
}