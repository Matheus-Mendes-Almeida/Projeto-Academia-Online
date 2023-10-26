package view;

import model.Usuario;
import model.AcademiaOnline;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
        AcademiaOnline academia = new AcademiaOnline();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Bem-vindo à Academia Online!");
            System.out.println("1. Cadastre-se");
            System.out.println("2. Faça login");
            System.out.println("3. Sair");
            System.out.print("\nEscolha uma opção: ");

            int escolha = scanner.nextInt();
            scanner.nextLine();

            switch (escolha) {
                case 1:
                    System.out.print("Nome: ");
                    String nome = scanner.nextLine();
                    System.out.print("Email: ");
                    String email = scanner.nextLine();
                    System.out.print("Senha: ");
                    String senha = scanner.nextLine();

                    academia.cadastrarUsuario(nome, email, senha);
                    break;
                case 2:
                    System.out.print("Email: ");
                    String loginEmail = scanner.nextLine();
                    System.out.print("Senha: ");
                    String loginSenha = scanner.nextLine();

                    Usuario usuarioLogado = academia.fazerLogin(loginEmail, loginSenha);
                    if (usuarioLogado != null) {
                        System.out.println("Bem-vindo, " + usuarioLogado.getNome() + "!");
                    } else {
                        System.out.println("Login falhou. Verifique suas credenciais.");
                    }
                    break;
                case 3:
                    System.out.println("Obrigado por usar a Academia Online. Adeus!");
                    System.exit(0);
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
            
            scanner.close();
        }
    }
}
