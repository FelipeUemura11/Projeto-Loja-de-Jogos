import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Loja {
    private List<ListaJogo> destaques;
    private List<ListaJogo> listaDeDesejos;
    private List<ListaJogo> ofertas;
    private Carrinho carrinho;

    public Loja() {
        this.destaques = new ArrayList<>();
        this.listaDeDesejos = new ArrayList<>();
        this.ofertas = new ArrayList<>();
        this.carrinho = new Carrinho();
    }

    public void adicionarDestaque(ListaJogo jogo) {
        destaques.add(jogo);
    }

    public void adicionarListaDeDesejos(ListaJogo jogo) {
        listaDeDesejos.add(jogo);
    }

    public void adicionarOferta(ListaJogo jogo) {
        ofertas.add(jogo);
    }

    public void gerenciarLoja(Scanner scanner) {
        while (true) {
            System.out.println("\n===== Loja =====");
            System.out.println("1. Ver Destaques");
            System.out.println("2. Ver Lista de Desejos");
            System.out.println("3. Ver Ofertas");
            System.out.println("4. Ver Carrinho");
            System.out.println("5. Voltar");
            System.out.print("Escolha uma opção: ");

            int opcao = scanner.nextInt();
            scanner.nextLine(); // Limpar buffer

            switch (opcao) {
                case 1:
                    exibirJogos(destaques, "Destaques");
                    break;
                case 2:
                    exibirJogos(listaDeDesejos, "Lista de Desejos");
                    break;
                case 3:
                    exibirJogos(ofertas, "Ofertas");
                    break;
                case 4:
                    carrinho.visualizarCarrinho();
                    break;
                case 5:
                    return;
                default:
                    System.out.println("Opção inválida! Tente novamente.");
            }
        }
    }

    private void exibirJogos(List<ListaJogo> jogos, String tipo) {
        System.out.println("\n===== " + tipo + " =====");
        if (jogos.isEmpty()) {
            System.out.println("Nenhum jogo disponível.");
        } else {
            for (ListaJogo jogo : jogos) {
                System.out.println(jogo);
                System.out.println("----------------------------------");
            }
        }
    }
}
