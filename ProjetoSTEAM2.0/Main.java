import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    private static List<CadastroUsuario> perfis = new ArrayList<>();
    private static CadastroUsuario perfilLogado = null;

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Comunidade comunidade = new Comunidade();
        Biblioteca biblioteca = new Biblioteca();
        Loja loja = new Loja();
        int opcao = 0;

        while (true) {
            System.out.println("\n===== Menu Principal =====");
            System.out.println("[1] Login");
            System.out.println("[2] Comunidade");
            System.out.println("[3] Biblioteca");
            System.out.println("[4] Loja");
            System.out.println("[4] Arquivo");
            System.out.println("[6] Sair");
            System.out.print("Escolha uma opção: ");

            opcao = scan.nextInt();
            scan.nextLine(); // Limpar buffer

            switch (opcao) {
                case 1:
                    int opc = 0;

                    System.out.println("[1] Nova Conta");
                    System.out.println("[2] Fazer Login");
                    System.out.println("[3] Voltar");

                    System.out.println("Escolha uma opcao: ");
                    opc = scan.nextInt();
                    scan.nextLine();

                    if(opc == 1){
                        criarPerfil(scan);
                    }else if(opc == 2){
                        fazerLogin(scan);
                    }else{
                        break;
                    }

                    break;
                case 2:
                    if (perfilLogado != null) {
                        comunidade.gerenciarComunidade(scan);
                    } else {
                        System.out.println("Faça login primeiro!");
                    }
                    break;
                case 3:
                    if (perfilLogado != null) {
                        biblioteca.gerenciarBiblioteca(scan);
                    } else {
                        System.out.println("Faça login primeiro!");
                    }
                    break;
                case 4:
                    if (perfilLogado != null) {
                        loja.gerenciarLoja(scan);
                    } else {
                        System.out.println("Faça login primeiro!");
                    }
                    break;
                case 5:
                    // Implementação do menu do arquivo
                    break;
                case 6:
                    System.out.println("Saindo...");
                    scan.close();
                    return;
                default:
                    System.out.println("Opção inválida! Tente novamente.");
            }
        }
    }

    private static void criarPerfil(Scanner scan) {
        System.out.print("Digite o nome do usuário: ");
        String nomeUsuario = scan.nextLine();
        System.out.print("Digite o email do usuário: ");
        String emailUsuario = scan.nextLine();
        System.out.print("Digite a senha do usuário: ");
        String senhaUsuario = scan.nextLine();

        perfis.add(new CadastroUsuario(new Perfil(nomeUsuario, emailUsuario), senhaUsuario, perfis));
        System.out.println("Perfil criado com sucesso!");
    }

    private static void fazerLogin(Scanner scan) {
        System.out.print("Digite o email: ");
        String email = scan.nextLine();
        System.out.print("Digite a senha: ");
        String senha = scan.nextLine();

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
