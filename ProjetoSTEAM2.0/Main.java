import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    private static List<CadastroUsuario> perfis = new ArrayList<>();
    private static CadastroUsuario perfilLogado = null;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Comunidade comunidade = new Comunidade();
        Biblioteca biblioteca = new Biblioteca();
        Loja loja = new Loja();
        
        while (true) {
            System.out.println("\n===== Menu Principal =====");
            System.out.println("1. Criar Perfil");
            System.out.println("2. Fazer Login");
            System.out.println("3. Comunidade");
            System.out.println("4. Biblioteca");
            System.out.println("5. Loja");
            System.out.println("6. Arquivo");
            System.out.println("7. Sair");
            System.out.print("Escolha uma opção: ");

           int opcao = scanner.nextInt();
            scanner.nextLine(); // Limpar buffer

            switch (opcao) {
                case 1:
                    criarPerfil(scanner);
                    break;
                case 2:
                    fazerLogin(scanner);
                    break;
                case 3:
                    if (perfilLogado != null) {
                        comunidade.gerenciarComunidade(scanner);
                    } else {
                        System.out.println("Faça login primeiro!");
                    }
                    break;
                case 4:
                    if (perfilLogado != null) {
                        biblioteca.gerenciarBiblioteca(scanner);
                    } else {
                        System.out.println("Faça login primeiro!");
                    }
                    break;
                case 5:
                    if (perfilLogado != null) {
                        loja.gerenciarLoja(scanner);
                    } else {
                        System.out.println("Faça login primeiro!");
                    }
                    break;
                case 6:
                    // Implementação do menu do arquivo
                    break;
                case 7:
                    System.out.println("Saindo...");
                    scanner.close();
                    return;
                default:
                    System.out.println("Opção inválida! Tente novamente.");
            }
        }
    }

    private static void criarPerfil(Scanner scanner) {
        System.out.print("Digite o nome do usuário: ");
        String nomeUsuario = scanner.nextLine();
        System.out.print("Digite o email do usuário: ");
        String emailUsuario = scanner.nextLine();
        System.out.print("Digite a senha do usuário: ");
        String senhaUsuario = scanner.nextLine();

        perfis.add(new CadastroUsuario(new Perfil(nomeUsuario, emailUsuario), senhaUsuario, perfis));
        System.out.println("Perfil criado com sucesso!");
    }

    private static void fazerLogin(Scanner scanner) {
        System.out.print("Digite o email: ");
        String email = scanner.nextLine();
        System.out.print("Digite a senha: ");
        String senha = scanner.nextLine();

        for (CadastroUsuario perfil : perfis) {
            if (perfil.getPerfil().getEmail().equals(email) && perfil.getSenha().equals(senha)) {
                perfilLogado = perfil;
                System.out.println("Login realizado com sucesso como " + perfilLogado.getPerfil().getNome() + "!");
                perfilLogado.gerenciarCadastro(); // Direcionar para o menu do cadastro
                return;
            }
        }

        System.out.println("Email ou senha incorretos!");
    }
}


