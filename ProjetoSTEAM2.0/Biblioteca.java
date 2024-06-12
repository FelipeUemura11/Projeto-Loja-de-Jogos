import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Biblioteca {
    private List<ListaJogo> jogos;

    public Biblioteca() {
        this.jogos = new ArrayList<>();
    }

    public void adicionarJogo(ListaJogo jogo) {
        jogos.add(jogo);
    }

    public void listarJogos() {
        if (jogos.isEmpty()) {
            System.out.println("Nenhum jogo na biblioteca.");
            return;
        }

        System.out.println("===== Jogos na Biblioteca =====");
        for (ListaJogo j : jogos) {
            System.out.println(j);
            System.out.println("----------------------------------");
        }
    }

    public void gerenciarBiblioteca(Scanner scanner) {
        while (true) {
            System.out.println("\n===== Biblioteca =====");
            System.out.println("1. Listar Jogos");
            System.out.println("2. Voltar");
            System.out.print("Escolha uma opção: ");

            int opcao = scanner.nextInt();
            scanner.nextLine(); // Limpar buffer

            switch (opcao) {
                case 1:
                    listarJogos();
                    break;
                case 2:
                    return;
                default:
                    System.out.println("Opção inválida! Tente novamente.");
            }
        }
    }
}
