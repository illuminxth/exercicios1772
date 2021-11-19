import java.util.Scanner;

public class exercicio4 {

  public static void main(String[] args) {
    String usuarioResposta = "usuarioAutenticado123";
    String senhaResposta = "senhaAutenticada123";

    boolean usuarioCorreto = false;
    boolean senhaCorreta = false;

    Scanner input = new Scanner(System.in);

    System.out.println("Usuário: ");
    String usuario = input.nextLine();
    System.out.println("Senha: ");
    String senha = input.nextLine();

    if (usuario.equals(usuarioResposta) == true) {
      usuarioCorreto = true;
    }

    if (senha.equals(senhaResposta) == true) {
      senhaCorreta = true;
    }

    if (senhaCorreta == true && usuarioCorreto == true) {
      System.out.println("ACESSO PERMITIDO");
    } else if (senhaCorreta == true && usuarioCorreto == false) {
      System.out.println("USUARIO INCORRETO");
    } else if (senhaCorreta == false && usuarioCorreto == true) {
      System.out.println("SENHA INCORRETA");
    } else {
      System.out.println("ACESSO NEGADO");
    }
  }
}