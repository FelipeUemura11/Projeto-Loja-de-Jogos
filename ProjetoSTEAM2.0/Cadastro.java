import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public abstract class Cadastro {
    protected Perfil perfil;
    protected List<Conquistas> conquistas;
    protected List<Amigos> amigos;
    protected List<Grupos> grupos;
    protected List<CadastroUsuario> todosPerfis;

    public Cadastro(Perfil perfil, List<CadastroUsuario> todosPerfis) {
        this.perfil = perfil;
        this.conquistas = new ArrayList<>();
        this.amigos = new ArrayList<>();
        this.grupos = new ArrayList<>();
        this.todosPerfis = todosPerfis;
    }

    public void gerenciarCadastro() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("\n===== Menu Cadastro =====");
            System.out.println("1. Exibir Perfil");
            System.out.println("2. Adicionar Conquista");
            System.out.println("3. Adicionar Amigo");
            System.out.println("4. Adicionar Grupo");
            System.out.println("5. Listar Amigos");
            System.out.println("6. Voltar");
            System.out.print("Escolha uma opção: ");

            int opcao = scanner.nextInt();
            scanner.nextLine(); // Limpar buffer

            switch (opcao) {
                case 1:
                    exibirPerfil();
                    break;
                case 2:
                    adicionarConquista(scanner);
                    break;
                case 3:
                    adicionarAmigo(scanner);
                    break;
                case 4:
                    adicionarGrupo(scanner);
                    break;
                case 5:
                    listarAmigos();
                    break;
                case 6:
                    return;
                default:
                    System.out.println("Opção inválida! Tente novamente.");
            }
        }
    }

    private void exibirPerfil() {
        System.out.println("===== Perfil de " + perfil.getNome() + " =====");
        System.out.println("Email: " + perfil.getEmail());
        // Outras informações do perfil, se houver
    }

    private void adicionarConquista(Scanner scanner) {
        System.out.print("Digite o nome da conquista: ");
        String nomeConquista = scanner.nextLine();
        conquistas.add(new Conquistas(nomeConquista));
        System.out.println("Conquista adicionada com sucesso!");
    }

    private void adicionarAmigo(Scanner scanner) {
        System.out.print("Digite o nome do amigo: ");
        String nomeAmigo = scanner.nextLine();
        boolean perfilExiste = false;
        for (CadastroUsuario perfil : todosPerfis) {
            if (perfil.getPerfil().getNome().equalsIgnoreCase(nomeAmigo)) {
                amigos.add(new Amigos(nomeAmigo));
                perfilExiste = true;
                System.out.println("Amigo adicionado com sucesso!");
                break;
            }
        }
        if (!perfilExiste) {
            System.out.println("O perfil " + nomeAmigo + " não existe.");
        }
    }

    private void adicionarGrupo(Scanner scanner) {
        System.out.print("Digite o nome do grupo: ");
        String nomeGrupo = scanner.nextLine();
        grupos.add(new Grupos(nomeGrupo));
        System.out.println("Grupo adicionado com sucesso!");
    }

    private void listarAmigos() {
        System.out.println("===== Amigos de " + perfil.getNome() + " =====");
        if (amigos.isEmpty()) {
            System.out.println("Você não possui amigos.");
        } else {
            for (Amigos amigo : amigos) {
                System.out.println(amigo.getNome());
            }
        }
    }
}
